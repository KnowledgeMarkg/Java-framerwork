package com.component;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    	String fname = req.getParameter("fname");
	    	String lname = req.getParameter("lname");
	    	String email = req.getParameter("email");
	    	
	    	PrintWriter out=  resp.getWriter();
	    	
	    	String htmlRespone = "<html>";
	    	htmlRespone += "<h2>Your FirstName is: " + fname + "</h2>";
	    	htmlRespone += "<h2>Your Last Name is: " + lname + "</h2>";
	    	htmlRespone += "<h2>Your Email is: " + email + "</h2>";
	    	htmlRespone += "</html>";
	    	 
	    	out.println(htmlRespone);
	    	
//	    	out.println("<h2>" +fname +"</h2>" +"</br>");
//	    	out.println("<h2>" +lname +"</h2>" +"</br>");
//	    	out.println("<h2>" +email +"</h2>" +"</br>");
	    	
	}

}
