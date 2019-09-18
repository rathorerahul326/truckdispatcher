package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.Owner_dto;

public class Owner_dao {
public static void owner(Owner_dto ownerdto) {
	String ownername=ownerdto.getName();
	String dob=ownerdto.getDob();
	String ssn=ownerdto.getSsn();
	Connection con=null;
	con=Connect.get();
	try {
		PreparedStatement ps=con.prepareStatement("insert into ownerinfo values(?,?,?)");
		ps.setString(1, ownername);
		ps.setString(2, dob);
		ps.setString(3, ssn);
		ps.executeUpdate();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public List<Owner_dto> ownerlist(){
	List<Owner_dto> list = new ArrayList<>();

	try {
		Connection con=null;
		con=Connect.get();

		PreparedStatement ps = con.prepareStatement("select * from ownerinfo");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
		    Owner_dto dto = new Owner_dto();
               
			dto.setName(rs.getString("ownername"));
			dto.setDob(rs.getString("dob"));
			dto.setSsn(rs.getString("ssn"));
			list.add(dto);
            
		}

		con.close();

	} catch (Exception e) {

		System.out.println(e);
	}
	
	return list;

}
public static String ownerName(String ssn) {
	String ownername=null;
	try {
		Connection con=null;
		con=Connect.get();

		PreparedStatement ps = con.prepareStatement("select * from ownerinfo where ssn='"+ssn+"'");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
               
			 ownername=rs.getString("ownername");
			
		}
		con.close();

	} catch (Exception e) {

		System.out.println(e);
	}
	  return ownername;

	
	
}


public static String ownerNamee(String ssn) {
	String ownername=null;
	try {
		Connection con=null;
		con=Connect.get();

		PreparedStatement ps = con.prepareStatement("select * from ownerinfo where ssn='"+ssn+"'");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
               
			 ownername=rs.getString("ownername");
			
		}
		con.close();

	} catch (Exception e) {

		System.out.println(e);
	}
	  return ownername;

	
	
}


}
