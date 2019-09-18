package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import com.dto.Driver_dto;

public class Driver_dao {

	public static void Driver(Driver_dto driverdto) {
		String drivername=driverdto.getDrivername();
		String driverssn=driverdto.getDriverssn();
		String driverdob=driverdto.getDriverdob();
		String licenceexpiration=driverdto.getLicenceexpiration();
		String medicalexpiration=driverdto.getMedicalexpiration();
		String drugtestexpiration=driverdto.getDrugtestexpiration();
		String trucknumber_assigned=driverdto.getTrucknumber_assigned();
	    String ownerssn=driverdto.getOwnerssn();
		
		Connection con=null;
		con=Connect.get();
		try {
			PreparedStatement ps=con.prepareStatement("insert into driverinfo values(?,?,?,?,?,?,?,?)");
			ps.setString(1,drivername);
			ps.setString(2,driverssn);
			ps.setString(3,driverdob);
			ps.setString(4,licenceexpiration);
			ps.setString(5, medicalexpiration);
			ps.setString(6, drugtestexpiration);
			ps.setString(7, trucknumber_assigned);
            ps.setString(8, ownerssn);
            ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		public static List<Driver_dto> driverView() {
			Connection con=null;
			con=Connect.get();
			List<Driver_dto> list=new ArrayList<Driver_dto>();

			try {
				PreparedStatement ps=con.prepareStatement("select * from driverinfo");
			    
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					Driver_dto driverdto=new Driver_dto();
					driverdto.setDrivername(rs.getString("drivername"));
					driverdto.setDriverssn(rs.getString("ownerssn"));
					driverdto.setDriverdob(rs.getString("driverdob"));
					driverdto.setLicenceexpiration(rs.getString("licenceexpiration"));
					driverdto.setMedicalexpiration(rs.getString("medicalexpiration"));
					driverdto.setDrugtestexpiration(rs.getString("drugtestexpiration"));
					driverdto.setTrucknumber_assigned(rs.getString("trucknumber_assigned"));
					String ownerssn=(String)rs.getString("ownerssn");
					String ownername= Owner_dao.ownerNamee(ownerssn);
					System.out.println("ksjsszx");
					System.out.println("ownername"+ownername);
				    driverdto.setOwnername("ownername");
					list.add(driverdto);
					
				}
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
		
		

		
	}
	
	
	
	

