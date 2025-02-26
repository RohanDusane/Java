package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Employee {
	public void insertdata() throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
	PreparedStatement ps = c.prepareStatement("insert into employee(emp_id,name,city)values(?,?,?)");
	ps.setInt(1, 2);
	ps.setString(2, "raj");
	ps.setString(3, "goa");
	ps.executeUpdate();
	System.out.println("Data is inserted...");
	c.close();
	}
	
	public void deletedata() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps = c.prepareStatement("delete from employee where emp_id=?");
		ps.setInt(1, 2);
		ps.executeUpdate();
		System.out.println("data is deleted...");
		c.close();
	}
	
	public void updatedata() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps = c.prepareStatement("update employee set name=? where emp_id=?");
		ps.setInt(1, 1);
		ps.setString(2, "saud");
		ps.executeUpdate();
		System.out.println("data is updated");
		c.close();
	
	}

}
