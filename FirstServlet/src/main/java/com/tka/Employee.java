package com.tka;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Empinfo")

public class Employee extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("name1");
		String lname = req.getParameter("lname1");
	    String Salary = req.getParameter("Salary1");
	    String Role = req.getParameter("role1");
		String JDate = req.getParameter("Joindate1");
		String Experience = req.getParameter("experience1");
		String city = req.getParameter("city1");
		String country = req.getParameter("country1");
		String Email = req.getParameter("Email1");
		String Pass = req.getParameter("Password1");
		String Contact = req.getParameter("Contact1");
		String Age = req.getParameter("age1");
		String DOB = req.getParameter("DOB1");
		String Mstatus = req.getParameter("marital Status1");
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(Salary);
		System.out.println(Role);
		System.out.println(JDate);
		System.out.println(Experience);
		System.out.println(city);
		System.out.println(country);
		System.out.println(Email);
		System.out.println(Pass);
		System.out.println(Contact);
		System.out.println(Age);
		System.out.println(DOB);
		System.out.println(Mstatus);
		
		
		PrintWriter out = resp.getWriter();
		out.println(fname);
		out.println(lname);
		out.println(Salary);
		out.println(Role);
		out.println(JDate);
		out.println(Experience);
		out.println(city);
		out.println(country);
		out.println(Email);
		out.println(Pass);
		out.println(Contact);
		out.println(Age);
		out.println(DOB);
		out.println(Mstatus);
		
	}
	

}


