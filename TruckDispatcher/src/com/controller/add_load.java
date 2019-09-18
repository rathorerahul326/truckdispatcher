package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Load_dao;
import com.dao.Transaction_dao;
import com.dao.Truckdetailinsert_dao;
import com.dto.Load_dto;
import com.dto.Transaction_dto;
import com.dto.Truck_dto;


@WebServlet("/add_load")
public class add_load extends HttpServlet {
	private static final long serialVersionUID = 1L;
       



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String loadnumber=request.getParameter("loadnumber");
		String trucknumber=request.getParameter("trucknumber");
		String gross=request.getParameter("gross");
		String gross_after_commission=request.getParameter("gross_after_commission");
        String dispatcher_Commission=request.getParameter("dispatcher_Commission");
		String pickupdate=request.getParameter("pick_up_date");  
		String pickupstate=request.getParameter("pick_up_state");
		String pickupcity=request.getParameter("pick_up_city");
		String dropoffdate=request.getParameter("drop_off_date");
		String dropoffstate=request.getParameter("drop_off_state");
        String dropoffcity=request.getParameter("drop_off_city");
		String quickfee=request.getParameter("quickfee");
		String advancedeposit=request.getParameter("advancedeposit");

        String status="0";
		Load_dto loaddto=new Load_dto();
		loaddto.setLoadnumber(loadnumber);
		loaddto.setTrucknumber(trucknumber);
		loaddto.setGross(gross);
		loaddto.setGross_after_commission(gross_after_commission);
		loaddto.setDispatcher_Commission(dispatcher_Commission);
		loaddto.setPickupcity(pickupcity);
		loaddto.setPickupdate(pickupdate);
		loaddto.setPickupstate(pickupstate);
		loaddto.setDropoffcity(dropoffcity);
		loaddto.setDropoffstate(dropoffstate);
		loaddto.setDropoffdate(dropoffdate);
		loaddto.setQuickfee(quickfee);
		loaddto.setStatus(status);
		
		Load_dao.load(loaddto);
		
		Transaction_dto transactiondto=new Transaction_dto(); 
		transactiondto.setAdvancedeposit(advancedeposit);
		transactiondto.setDispatcher_Commission(dispatcher_Commission);
		transactiondto.setGross(gross);
		transactiondto.setGross_after_commission(gross_after_commission);
		transactiondto.setQuickfee(quickfee);
		transactiondto.setLoadnumber(loadnumber);
		Transaction_dao.transaction(transactiondto);
	
	}

}
