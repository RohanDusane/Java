package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.tka.Employe;

public class Employe {
	
public void createTable() throws Exception {
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps = c.prepareStatement("create table employe (emp_id int primary key auto_increment, name varchar(20), city varchar(20), age int");
        ps.executeUpdate();
		System.out.println("Employe table create successfully...");
		c.close();
	}
	
	public void insertEmploye() throws Exception {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps = c.prepareStatement("insert into employe(name, city, age) values ('sachin','pune',32)");
		ps.setString(1, "Sachin");
		ps.setString(2, "pune");
		ps.setInt(3, 32);
		ps.executeUpdate();
		
		ps.setString(1, "rahul");
		ps.setString(2, "baglore");
		ps.setInt(3, 35);
		ps.executeUpdate();
		
		System.out.println("Employe inserted successfully");
		c.close();
		
	}
	
	 public void updateEmploye() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        PreparedStatement ps = c.prepareStatement("UPDATE Employ SET city=? WHERE name=? ");
	        ps.setString(1, "mumbai");
	        ps.setString(2, "sachin");
	        ps.executeUpdate();
	        System.out.println("Employe updated successfully");
	        c.close();
	 }
	
	public void deleteEmploye() throws Exception {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps = c.prepareStatement("delete from Employ where name=?");
		ps.setString(1, "sachin");
		ps.executeUpdate();
		System.out.println("Employ data deleted succcessfully...");
		c.close();
	}
	
	public void selectEmploye() throws Exception {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps = c.prepareStatement("select * from Employ");
		 ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
		}
		c.close();
	}
		
	    public static void main(String[] args) throws Exception {
			Employe E = new Employe();

	}
}


