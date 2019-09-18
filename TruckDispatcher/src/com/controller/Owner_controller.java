package com.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Owner_dao;
import com.dto.Owner_dto;

@WebServlet("/owner_controller")
public class Owner_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

  


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
     String name=request.getParameter("name");
     String  dob=request.getParameter("dob");
     String ssn=request.getParameter("ssn");
     Owner_dto ownerdto=new Owner_dto();
     ownerdto.setName(name);
     ownerdto.setDob(dob);
     ownerdto.setSsn(ssn);
     Owner_dao.owner(ownerdto);
     
	
	}

}
