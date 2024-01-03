package com.regist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {

	public static void main(String[] args) {
		try {
			String email = "faizraza349@gmail.com";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "kausar", "kausar86");
			PreparedStatement pst =  con.prepareStatement("delete from person where email = ?");
			pst.setString(1, email);
			int n = pst.executeUpdate();
			if(n>0) {
				System.out.println("Deletion Success");
			}else {
				System.out.println("Deletion failed");
			}
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}

}
