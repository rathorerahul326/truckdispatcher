package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.dto.Owner_dto;

public class Ownerlist_dao {
	public List<Owner_dto> owenrlistget(){
		Connection con=null;
		con=Connect.get();
		
		List<Owner_dto> list=new ArrayList<Owner_dto>();
		try {
			PreparedStatement ps=con.prepareStatement("select * from ownerinfo");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Owner_dto ownerdto=new Owner_dto();
				  ownerdto.setName(rs.getString("ownername"));
				  ownerdto.setDob(rs.getString("dob"));
				  ownerdto.setSsn(rs.getString("ssn"));
			      list.add(ownerdto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
