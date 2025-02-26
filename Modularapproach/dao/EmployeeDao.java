package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDao {
	
	public void insertdata() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into employee values(1,'suresh','goa')");
		System.out.println("data is inserted..");
		c.close();
	}
    
	public void updateData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("UPDATE employee SET empname='kapil' WHERE empid=2");
		System.out.println("data is Updated...");
		c.close();
	}
	
	public void deleteData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("DELETE FROM employee WHERE empid = 2");
		System.out.println("data is Deleted...");
		c.close();
	}
	
	public void selectData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("SELECT * FROM employee");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1) +" "+ rs.getString(2) + " " + rs.getString(3));
		}
		
		System.out.println("Deleted...");
		c.close();
	}
	
}

