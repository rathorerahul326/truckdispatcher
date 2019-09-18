package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Transaction_dao;


@WebServlet("/add_remainingamount")
public class add_remainingamount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String loadnumber=request.getParameter("LoadNumber");
		System.out.println("loadnumber "+loadnumber);
		String remainingamount=Transaction_dao.transactionfetch(loadnumber);
		System.out.println(remainingamount);
		System.out.println("samm");

		
	}

}
