package com.mavenstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HotelManagement {
	
	public void createTable() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.execute("CREATE TABLE laptops(room_no int PRIMARY KEY AUTO_INCREMENT, name varchar(50),  city varchar(50), Manager varchar(30))");
		System.out.println("Hotel Table is Created...");
		
		c.close();
	}
	
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.execute("INSERT INTO HotelManagaement(nmae, city, Manager) VALUES('Royal palace', 'jalgaon', 'karan shah'), ('silver palace', 'mumbai', 'rajan pasi'), ('kamal paradise', 'pune', 'Abhishek kataria')");
		System.out.println("Hotel Data is Inserted");
		
		c.close();
	}
	
	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.execute("UPDATE HotelManagement SET name='Grand resort' WHERE Manager='karan shah'");
		System.out.println("Hotel Data is Updated");
		
		c.close();
	}
	
	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.execute("DELETE FROM HotelManagement WHERE name='siver palace'");
		System.out.println("Hotel Data is Deleted");
		
		c.close();
	}
	
	public void  selectData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("SELECT * FROM HotelManagement");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		
		c.close();
	}

	public static void main(String[] args) throws Exception {
		HotelManagement HM = new HotelManagement();
//		HM.createTable();
//		HM.insertData();
//		HM.updateData();
//		HM.deleteData();
		HM.selectData();
		
	}

}


