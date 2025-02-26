package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Student extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		String name1 = req.getParameter("name1");
		String age = req.getParameter("age1");
		String city = req.getParameter("city1");
		
		try {
			Class.forName("com.myysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204?useSSL=true","root","root");
			PreparedStatement ps = c.prepareStatement("insert into student(name,age,city)values(?,?,?)");
			ps.setString(1, name1);
			ps.setString(2, age);
			ps.setString(3, city);
			ps.executeUpdate();
			
			PrintWriter out = resp.getWriter();
			System.out.println("Data is inserted...");
			out.print("<h1>"+"Data is inserted Successfully..."+"</h1>");
			c.close();
			}
		catch(Exception e) {
	}
	}
}
	 
		
		