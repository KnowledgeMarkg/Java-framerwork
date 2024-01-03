package com.component;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/Login")
public class RequestDispatcherdemo extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String name = req.getParameter("fname");
	    String email = req.getParameter("email");
	     PrintWriter out = resp.getWriter();
	    if(name.equals("Kausar") && email.equals("faizraza349@gmail.com")) {
	   HttpSession hs=   req.getSession();
	   hs.setAttribute("email", name);
	     RequestDispatcher	rd =req.getRequestDispatcher("/profile.jsp");
	     rd.forward(req, resp);
	    }else {
	    	String htmlRespone = "<html>";
	    	htmlRespone += "<h2> Name And Password Is Not Correct";
	    	out.println(htmlRespone);
	    	RequestDispatcher	rd =req.getRequestDispatcher("/index.html");
	    	rd.include(req, resp);
	    }
	}

}
