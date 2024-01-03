package com.regist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {

	public static void main(String[] args) {
		try {
			
			String city = "deoria";
			String email = "jobsapplyfor349@gmail.com";
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "kausar", "kausar86");
			PreparedStatement pst =con.prepareStatement("update person set city=? where email=?");
			pst.setString(1, city);
			pst.setString(2, email);
			
			int count = pst.executeUpdate();
			
			if(count>0) {
				System.out.println("Update Success");
			}else {
				System.out.println("Not Update ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
