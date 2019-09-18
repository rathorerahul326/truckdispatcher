package com.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Driver_dao;
import com.dao.Owner_dao;
import com.dao.Truckdetailinsert_dao;
import com.dto.Driver_dto;
import com.dto.Truck_dto;


@WebServlet("/view_driverdetail")
public class view_driverdetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
   

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     List<Driver_dto> driverdetaillist= Driver_dao.driverView();
	     for (Iterator<Driver_dto> i = driverdetaillist.iterator(); i.hasNext();) {
	 	    Driver_dto item = i.next();
	 	    System.out.println(item.getDrivername());
	 	}
	     request.setAttribute("driverdetaillist",driverdetaillist);
	 	request.getRequestDispatcher("view_driver.jsp").include(request, response);
	 	
		
		}
		
	}


