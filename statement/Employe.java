package com.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employe {
	
	public void createTable() throws Exception {
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("create table employe (emp_id int primary key auto_increment, name varchar(20), city varchar(20), age int");
		System.out.println("Employ table create successfully...");
		c.close();
	}
	
	public void insertEmploy() throws Exception {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into employe(name, city, age) values ('sachin','pune',32)");
		s.executeUpdate("insert into employe(name, city, age) values ('rahul','banglore',35)");
		s.executeUpdate("insert into employe(name, city, age) values ('kunal','goa',28)");
		s.executeUpdate("insert into employe(name, city, age) values ('naresh','nashik',30)");
		s.executeUpdate("insert into employe(name, city, age) values ('priyansh','mumbai',37)");
		System.out.println("Employ data inserted successfully...");
		c.close();
	}
	
	 public void updateEmploy() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        Statement s = c.createStatement();
	        s.executeUpdate("UPDATE Employ SET city=chennai WHERE name='kunal'");
	        System.out.println("Employ updated successfully");
	        c.close();
	 }
	
	public void deleteEmploy() throws Exception {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from Employ where name='naresh'");
		System.out.println("Employ data deleted succcessfully...");
		c.close();
	}
	
	public void selectEmploy() throws Exception {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from Employ");
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
		}
		c.close();
	}
		
	    public static void main(String[] args) throws Exception {
			Employe b = new Employe();

	}
}