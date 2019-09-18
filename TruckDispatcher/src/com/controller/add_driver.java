package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

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


@WebServlet("/add_driver")
public class add_driver extends HttpServlet {
	private static final long serialVersionUID = 1L;

    



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String drivername=request.getParameter("drivername");
		String driverssn=request.getParameter("driverssn");
		String driverdob=request.getParameter("driverdob");
		String licenceexpiration=request.getParameter("licenceexpiration");
		String medicalexpiration=request.getParameter("medicalexpiration");
		String drugtestexpiration=request.getParameter("drugtestexpiration");
		String trucknumber_assigned=request.getParameter("trucknumber");
		String ownerssn=request.getParameter("ownerssn");
        String ownername= Owner_dao.ownerName(ownerssn);

          Driver_dto driverdto=new Driver_dto();
          driverdto.setDrivername(drivername);
          driverdto.setDriverssn(driverssn);
          driverdto.setDriverdob(driverdob);
          driverdto.setDrugtestexpiration(drugtestexpiration);
          driverdto.setLicenceexpiration(licenceexpiration);
          driverdto.setMedicalexpiration(medicalexpiration);
          driverdto.setOwnerssn(ownerssn);
          driverdto.setTrucknumber_assigned(trucknumber_assigned);
          Driver_dao.Driver(driverdto);
          
          
      		
	}

}
