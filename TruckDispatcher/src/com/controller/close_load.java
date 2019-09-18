package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Load_dao;



@WebServlet("/close_load")
public class close_load extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

           	System.out.println("Kuch Bhi Likh do");
           	String trucknumber=request.getParameter("truckid");
           	System.out.println(trucknumber);
	        Load_dao.loadclose(trucknumber);
	     	System.out.println("Ho gya Kaam");
	     	request.getRequestDispatcher("view_activeload").forward(request, response);
	
	}
	}
