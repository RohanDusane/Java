package com.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Laptops {
	
	public void createTable() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
        Statement s = c.createStatement();
        s.executeUpdate("create table Laptops (id INT PRIMARY KEY AUTO_INCREMENT, color VARCHAR(50), model VARCHAR(50), price INT)");
        System.out.println("Laptops table created successfully...");
        c.close();
    }
	
	 public void insertLaptops() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        Statement s = c.createStatement();
	        s.executeUpdate("INSERT INTO Laptops (color, model, price) VALUES ('black', 'dell', 80000)");
	        s.executeUpdate("INSERT INTO Laptops (color, model, price) VALUES ('white', 'lenovo', 70000)");
	        s.executeUpdate("INSERT INTO Laptops (color, model, price) VALUES ('red', 'mackbook', 1000000)");
	        s.executeUpdate("INSERT INTO Laptops (color, model, price) VALUES ('grey', 'Hp', 50000)");
	        s.executeUpdate("INSERT INTO Laptops (color, model, price) VALUES ('yellow', 'acer', 65000)");
	        System.out.println("Laptops inserted successfully");
	        c.close();
	 }
	 
	 public void updateLaptops() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        Statement s = c.createStatement();
	        s.executeUpdate("UPDATE laptops SET price=75000 WHERE model='Hp'");
	        System.out.println("Laptops updated successfully...");
	        c.close();
	    }

	    public void deleteLaptops() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        Statement s = c.createStatement();
	        s.executeUpdate("DELETE FROM Laptops WHERE model='mackbook'");
	        System.out.println("Laptops deleted successfully...");
	        c.close();
	    }

	    public void selectLaptops() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        Statement s = c.createStatement();
	        ResultSet rs = s.executeQuery("SELECT * FROM Laptops");
	        while (rs.next()) {
	            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
	        }
	        c.close();
	    }
	    
	    public static void main(String[] args) throws Exception {
			Laptops b = new Laptops();
	  }      

}



