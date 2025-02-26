package com.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Cars {
	
	public void createTable() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
        Statement s = c.createStatement();
        s.executeUpdate("create table cars (id INT PRIMARY KEY AUTO_INCREMENT, color VARCHAR(50), model VARCHAR(50), price INT)");
        System.out.println("Cars table created successfully...");
        c.close();
    }
	
	 public void insertCars() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        Statement s = c.createStatement();
	        s.executeUpdate("INSERT INTO cars (color, model, price) VALUES ('black', 'creta', 2000000)");
	        s.executeUpdate("INSERT INTO cars (color, model, price) VALUES ('white', 'sonet', 1600000)");
	        s.executeUpdate("INSERT INTO cars (color, model, price) VALUES ('red', 'verna', 1500000)");
	        s.executeUpdate("INSERT INTO cars (color, model, price) VALUES ('grey', 'harrier', 30000000)");
	        s.executeUpdate("INSERT INTO cars (color, model, price) VALUES ('yellow', 'safari', 500000)");
	        System.out.println("Car inserted successfully");
	        c.close();
	 }
	 
	 public void updateCars() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        Statement s = c.createStatement();
	        s.executeUpdate("UPDATE cars SET price=7000000 WHERE model='creta'");
	        System.out.println("cars updated successfully...");
	        c.close();
	    }

	    public void deleteCars() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        Statement s = c.createStatement();
	        s.executeUpdate("DELETE FROM Cars WHERE model='verna'");
	        System.out.println("Cars deleted successfully...");
	        c.close();
	    }

	    public void selectCars() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        Statement s = c.createStatement();
	        ResultSet rs = s.executeQuery("SELECT * FROM Cars");
	        while (rs.next()) {
	            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
	        }
	        c.close();
	    }
	    
	    public static void main(String[] args) throws Exception {
			Cars b = new Cars();
	  }      

}
