package com.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Truckdetailinsert_dao;
import com.dto.Truck_dto;


@WebServlet("/addtruck_inload")
public class addtruck_inload extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 List<Truck_dto> truckdetaillist= Truckdetailinsert_dao.truckView();
	     for (Iterator<Truck_dto> i = truckdetaillist.iterator(); i.hasNext();) {
	 	    Truck_dto item = i.next();
	 	    System.out.println(item.getTrucknumber());
	 	}
	     request.setAttribute("truckdetaillist",truckdetaillist);
		
			request.getRequestDispatcher("add_load.jsp").include(request, response);

	}

}
