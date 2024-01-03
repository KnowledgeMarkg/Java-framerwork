package com.regist;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/register")
public class Registration extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobNum = req.getParameter("num");
		String age = req.getParameter("age");
		String city = req.getParameter("city");
		out.println(name);
		out.println(email);
		out.println(mobNum);
		out.println(age);
		out.println(city);
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "kausar", "kausar86");
			java.sql.PreparedStatement ps = con.prepareStatement("insert into person values (?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, mobNum);
			ps.setString(4, age);
			ps.setString(5, city);
			int count =ps.executeUpdate();
			if(count>0) {
				resp.setContentType("text/html");
				out.println("<h3>User Register Success</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
			}else {
				resp.setContentType("text/html");
				out.println("<h3 style='color:blue;text-align:center'>User Not Register Success</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			resp.setContentType("text/html");
			out.println("<h3 style='color:blue;text-align:center'>"+e.getMessage()+"</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
			rd.include(req, resp);
		}
	}

}
