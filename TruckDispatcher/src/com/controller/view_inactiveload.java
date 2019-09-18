package com.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Load_dao;
import com.dto.Load_dto;

@WebServlet("/view_inactiveload")
public class view_inactiveload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	     List<Load_dto> loaddetaillist= Load_dao.loadViewinactive();
	     for (Iterator<Load_dto> i = loaddetaillist.iterator(); i.hasNext();) {
	 	    Load_dto item = i.next();
	 	    System.out.println(item.getDropoffcity());
	 	}
	     request.setAttribute("loaddetaillist",loaddetaillist);
	 	request.getRequestDispatcher("view_inactiveload.jsp").include(request, response);
	 	
		
		
}
		
	}


