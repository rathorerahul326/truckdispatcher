package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dto.Load_dto;
import com.dto.Transaction_dto;

public class Transaction_dao {

	public static void transaction(Transaction_dto transactiondto) {
		String loadnumber=transactiondto.getLoadnumber();
		String dispatcher_Commission=transactiondto.getAdvancedeposit();
		String gross_after_commission=transactiondto.getDispatcher_Commission();
		String quickfee=transactiondto.getGross();
		String advancedeposit=transactiondto.getAdvancedeposit();
		String gross=transactiondto.getGross();
		Connection con=null;
		con=Connect.get();
		try {
			PreparedStatement ps=con.prepareStatement("insert into transactioninfo values(?,?,?,?,?,?)");
			ps.setString(1,loadnumber);
			ps.setString(2,gross);
			ps.setString(3,dispatcher_Commission);
			ps.setString(4,gross_after_commission);
			ps.setString(5,quickfee);
			ps.setString(6,advancedeposit);
           

			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String transactionfetch(String loadnumber) {
		String advancedeposit=null;
		try {
			Connection con=null;
			con=Connect.get();

			PreparedStatement ps = con.prepareStatement("select * from transactioninfo where loadnumber='"+loadnumber+"'");
      
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
	               
				advancedeposit=rs.getString(6);
				System.out.println(advancedeposit);
				System.out.println("in while");
			}
			con.close();

		} catch (Exception e) {

			System.out.println(e);
		}
		  return advancedeposit;

		
		
	}
	
}
