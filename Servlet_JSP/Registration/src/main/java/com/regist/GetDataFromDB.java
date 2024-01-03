package com.regist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetDataFromDB {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "kausar", "kausar86");
		    PreparedStatement pst = con.prepareStatement("select * from person");
		    ResultSet rs= pst.executeQuery();
		    
		    while(rs.next()) {
		    	String name = rs.getString("name");
		    	String email = rs.getString("email");
		    	String mobileNum = rs.getString("mobileNum");
		    	String age = rs.getString("age");
		    	String city = rs.getString("city");
		    	
		    	System.out.println(name);
		    	System.out.println(email);
		    	System.out.println(mobileNum);
		    	System.out.println(age);
		    	System.out.println(city);
		    	
		    	System.out.println("-------------");
		    }
		} catch (Exception e) {
			e.printStackTrace();
			}
	}

}
