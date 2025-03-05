package com.jbk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Car {
	
	public void createTable() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.execute("CREATE TABLE Car(cost int PRIMARY KEY AUTO_INCREMENT, model varchar(50),  color varchar(50), company varchar(30))");
		System.out.println("Car Table is Created...");
		
		c.close();
	}
	
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.execute("INSERT INTO Car(model, color, company) VALUES('creta', 'black', 'kia'), ('Range Rover', 'White', 'Tata motors'), ('swift', 'grey', 'suzuki')");
		System.out.println("Car Data is Inserted");
		
		c.close();
	}
	
	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.execute("UPDATE Car SET name='varna' WHERE color='black'");
		System.out.println("Car Data is Updated");
		
		c.close();
	}
	
	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.execute("DELETE FROM Car WHERE name='Range Rover'");
		System.out.println("Car Data is Deleted");
		
		c.close();
	}
	
	public void  selectData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("SELECT * Car");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		
		c.close();
	}

	public static void main(String[] args) throws Exception {
		Car c = new Car();
		c.createTable();
		c.insertData();
		c.updateData();
		c.deleteData();
		c.selectData();
		
	}

}




