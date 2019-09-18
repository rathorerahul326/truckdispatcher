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
import com.dto.Truck_dto;


@WebServlet("/addtruck_indriver")
public class addtruck_indriver extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String trucknumber=request.getParameter("OwnerSsn");
		 String  trucknumberr=Truckdetailinsert_dao.GetTrucknumber(trucknumber);
		 System.out.println("kjdsl.");
		 System.out.println(trucknumberr);
         response.getWriter().append(trucknumberr);
			
		 	
			
			
	}

}
