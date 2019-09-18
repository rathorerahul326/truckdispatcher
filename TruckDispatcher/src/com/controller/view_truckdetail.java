package com.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Owner_dao;
import com.dao.Truckdetailinsert_dao;
import com.dto.Owner_dto;
import com.dto.Truck_dto;


@WebServlet("/view_truckdetail")
public class view_truckdetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     Owner_dao ownerdao=new Owner_dao();
     List<Truck_dto> truckdetaillist= Truckdetailinsert_dao.truckView();
     for (Iterator<Truck_dto> i = truckdetaillist.iterator(); i.hasNext();) {
 	    Truck_dto item = i.next();
 	    System.out.println(item.getTrucknumber());
 	}
     request.setAttribute("truckdetaillist",truckdetaillist);
 	request.getRequestDispatcher("view_truck.jsp").include(request, response);
 	
	
	}

}
