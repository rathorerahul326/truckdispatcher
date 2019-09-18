package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Ownerlist_dao;
import com.dto.Owner_dto;

@WebServlet("/Ownername_list")
public class Ownername_list extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Ownerlist_dao ownerdao=new Ownerlist_dao();
		List<Owner_dto> list=ownerdao.owenrlistget();
		request.setAttribute("OwnerName",list);
		request.getRequestDispatcher("add_truck.jsp").include(request, response);
		
	
		
	}

}
