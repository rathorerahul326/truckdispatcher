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
import com.dto.Owner_dto;


@WebServlet("/Ownerlist_controller")
public class Ownerlist_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Owner_dao ownerdao=new Owner_dao();
	List<Owner_dto> ownerdto=ownerdao.ownerlist();
	for (Iterator<Owner_dto> i = ownerdto.iterator(); i.hasNext();) {
	    Owner_dto item = i.next();
	    System.out.println(item.getName());
	}
	request.setAttribute("ownerlist",ownerdto);
	request.getRequestDispatcher("view_owner.jsp").include(request, response);
	}

}
