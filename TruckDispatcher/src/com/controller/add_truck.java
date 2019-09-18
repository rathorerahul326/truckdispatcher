package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Truckdetailinsert_dao;
import com.dto.Truck_dto;


@WebServlet("/add_truck")
public class add_truck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String ownerssn=request.getParameter("ownerssn");
		String trucknumber=request.getParameter("trucknumber");
		String milage=request.getParameter("milage");
		String email=request.getParameter("email");
		String truckregistrationdate=request.getParameter("truckregistrationdate");
		Truck_dto truckdto=new Truck_dto();
		truckdto.setSsn(ownerssn);
		truckdto.setTrucknumber(trucknumber);
		truckdto.setMilage(milage);
		truckdto.setTruckregistrationdate(truckregistrationdate);
		truckdto.setEmail(email);
		Truckdetailinsert_dao.truck(truckdto);
		
		
	}

		
}
