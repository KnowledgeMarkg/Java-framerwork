package com.regist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class registerDemo {

	public static void main(String[] args) throws Exception {
		String name = "Raza";
		String email = "knowledgemarkz@gmail.com";
		String num = "8052738480";
		String age = "10/12/2002";
		String city = "Banglore";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "kausar", "kausar86");
		PreparedStatement pst= con.prepareStatement("insert into person values(?,?,?,?,?)");
		pst.setString(1, name);
		pst.setString(2, email);
		pst.setString(3,num);
		pst.setString(4, age);
		pst.setString(5, city);
		int count = pst.executeUpdate();
		if(count>0) {
			System.out.println("update Success");
			
		}else {
			System.out.println("not insert");
		}
	}

}
