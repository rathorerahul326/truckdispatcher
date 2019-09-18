package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.dto.Owner_dto;
import com.dto.Truck_dto;

public class Truckdetailinsert_dao {

	public static void truck(Truck_dto truckdto) {
		String ssn=truckdto.getSsn();
		String trucknumber=truckdto.getTrucknumber();
		String milage=truckdto.getMilage();
		String email=truckdto.getEmail();
		String truckregistrationdate=truckdto.getTruckregistrationdate();
		
		Connection con=null;
		con=Connect.get();
		try {
			PreparedStatement ps=con.prepareStatement("insert into truckinfo values(?,?,?,?,?)");
			ps.setString(1,ssn);
			ps.setString(2,trucknumber);
			ps.setString(3,milage);
			ps.setString(4, milage);
			ps.setString(5,truckregistrationdate);
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static List<Truck_dto> truckView() {
		Connection con=null;
		con=Connect.get();
		List<Truck_dto> list=new ArrayList<Truck_dto>();

		try {
			PreparedStatement ps=con.prepareStatement("select * from truckinfo");
		    
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Truck_dto truckdto=new Truck_dto();
				String ssn=(String)(rs.getString("ownerssn"));
		        String ownername= Owner_dao.ownerName(ssn);
		        truckdto.setOwnername(ownername);
		        truckdto.setTrucknumber(rs.getString("trucknumber"));
		        truckdto.setMilage(rs.getString("milage"));
		        truckdto.setEmail(rs.getString("email"));
		        truckdto.setTruckregistrationdate(rs.getString("truckregistrationdate"));
				list.add(truckdto);
				
				
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	

	public static String GetTrucknumber(String ownerssn){
		Connection con=null;
		con=Connect.get();
		try {
			PreparedStatement ps2=con.prepareStatement("select * from truckinfo where ownerssn=?");
			ps2.setString(1, ownerssn);;
			System.out.println("inside trucknumber according to ssn");
			ResultSet rs2=ps2.executeQuery();
			JSONArray jarray=new JSONArray();
			while(rs2.next()){
				JSONObject jobject=new JSONObject();
				
				System.out.println(rs2.getString(3));
				jobject.put("trucknumber", rs2.getString(2));
				jarray.add(jobject);
			}
			String st=jarray.toJSONString();
			return st;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}	
	
	
	
	
	
}
