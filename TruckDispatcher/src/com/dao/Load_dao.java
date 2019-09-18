package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dto.Driver_dto;
import com.dto.Load_dto;



public class Load_dao {
	public static void load(Load_dto loaddto) {
		String loadnumber=loaddto.getLoadnumber();
		String trucknumber=loaddto.getTrucknumber();
		String gross=loaddto.getGross();
		String dispatcher_Commission=loaddto.getDispatcher_Commission();
		String gross_after_commission=loaddto.getGross_after_commission();
		String pickupdate=loaddto.getPickupdate();
		String pickupstate=loaddto.getPickupstate();
		String pickupcity=loaddto.getPickupcity();
		String dropoffdate=loaddto.getDropoffdate();
		String dropoffstate=loaddto.getDropoffstate();
	    String dropoffcity=loaddto.getDropoffcity();
		String quickfee=loaddto.getQuickfee();
		String status=loaddto.getStatus();
		Connection con=null;
		con=Connect.get();
		try {
			PreparedStatement ps=con.prepareStatement("insert into loadinfo values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,loadnumber);
			ps.setString(2,trucknumber);
			ps.setString(3,gross);
			ps.setString(4,dispatcher_Commission);
            ps.setString(5,gross_after_commission);
			ps.setString(6,pickupdate);
			ps.setString(7,pickupstate);
			ps.setString(8,pickupcity);
			ps.setString(9,dropoffdate);
			ps.setString(10,dropoffstate);
			ps.setString(11,dropoffcity);
			ps.setString(12,quickfee);
			ps.setString(13,status);

			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<Load_dto> loadView() {
		Connection con=null;
		con=Connect.get();
		List<Load_dto> list=new ArrayList<Load_dto>();

		try {
			PreparedStatement ps=con.prepareStatement("select * from loadinfo where status='"+0+"'");
		    
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Load_dto loaddto=new Load_dto();
				loaddto.setDispatcher_Commission(rs.getString("dispatcher_Commission"));
				loaddto.setDropoffcity(rs.getString("dropoffcity"));
				loaddto.setDropoffdate(rs.getString("dropoffdate"));
				loaddto.setDropoffstate(rs.getString("dropoffstate"));
				loaddto.setPickupcity(rs.getString("pickupcity"));
				loaddto.setPickupstate(rs.getString("pickupstate"));
				loaddto.setPickupdate(rs.getString("pickupdate"));
				loaddto.setGross(rs.getString("gross"));
				loaddto.setGross_after_commission(rs.getString("gross_after_commission"));
				loaddto.setQuickfee(rs.getString("quickfee"));
			    loaddto.setTrucknumber(rs.getString("trucknumber"));
			    loaddto.setStatus(rs.getString("status"));
			    String loadnumber=rs.getString("loadnumber");
                loaddto.setLoadnumber(loadnumber);
			    String advancedeposit=Transaction_dao.transactionfetch(loadnumber);
			    loaddto.setAdvancedeposit(advancedeposit);
				list.add(loaddto);
				
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<Load_dto> loadViewinactive() {
		Connection con=null;
		con=Connect.get();
		List<Load_dto> list=new ArrayList<Load_dto>();

		try {
			PreparedStatement ps=con.prepareStatement("select * from loadinfo where status='"+1+"'");
		    
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Load_dto loaddto=new Load_dto();
				loaddto.setDispatcher_Commission(rs.getString("dispatcher_Commission"));
				loaddto.setDropoffcity(rs.getString("dropoffcity"));
				loaddto.setDropoffdate(rs.getString("dropoffdate"));
				loaddto.setDropoffstate(rs.getString("dropoffstate"));
				loaddto.setPickupcity(rs.getString("pickupcity"));
				loaddto.setPickupstate(rs.getString("pickupstate"));
				loaddto.setPickupdate(rs.getString("pickupdate"));
				loaddto.setGross(rs.getString("gross"));
				loaddto.setGross_after_commission(rs.getString("gross_after_commission"));
				loaddto.setLoadnumber(rs.getString("loadnumber"));
				loaddto.setQuickfee(rs.getString("quickfee"));
			    loaddto.setTrucknumber(rs.getString("trucknumber"));
			    loaddto.setStatus(rs.getString("status"));
				list.add(loaddto);
				
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public static void loadclose(String trucknumberr) {
	   System.out.println(trucknumberr);
		Connection con=null;
		con=Connect.get();
		

		try {
           Statement stmt=con.createStatement();  
		    
			int result=stmt.executeUpdate("update loadinfo set status='1' where trucknumber='"+trucknumberr+"'");
			
			System.out.println("query Update Succesfully");
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
