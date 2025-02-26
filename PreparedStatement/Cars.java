package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.tka.Cars;

public class Cars {
	
	public void createTable() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
        PreparedStatement ps = c.prepareStatement("create table cars (id INT PRIMARY KEY AUTO_INCREMENT, color VARCHAR(50), model VARCHAR(50), price INT)");
        ps.executeUpdate();
        System.out.println("Cars table created successfully...");
        c.close();
    }
	
	 public void insertCars() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        PreparedStatement ps = c.prepareStatement("INSERT INTO cars (color, model, price) VALUES (?,?,?)");
	        ps.setString(1, "black");
	        ps.setString(2, "creta");
	        ps.setInt(3, 20000000);
	        ps.executeUpdate();
	        
	        ps.setString(1, "white");
	        ps.setString(2, "sonet");
	        ps.setInt(3, 16000000);
	        ps.executeUpdate();
	        
	        System.out.println("Cars inserted successfully");
	        c.close();
	        
	        
	  }
	 
	 public void updateCars() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        PreparedStatement ps = c.prepareStatement("UPDATE cars SET price=? WHERE model=? ");
	        ps.setInt(1, 30000000);
	        ps.setString(2, "Sonet");
	        ps.executeUpdate();
	        System.out.println("cars updated successfully...");
	        c.close();
	    }

	    public void deleteCars() throws Exception {
	    	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        PreparedStatement ps = c.prepareStatement("DELETE FROM cars WHERE model = ?");
	        ps.setString(1, "creta");
	        ps.executeUpdate();
	        System.out.println("Car deleted successfully");
	        c.close();
	    }

	    public void selectCars() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        PreparedStatement s = c.prepareStatement("SELECT * FROM Cars");
	        ResultSet rs = s.executeQuery();
	        while (rs.next()) {
	            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
	        }
	        c.close();
	    }
	    
	    public static void main(String[] args) throws Exception {
			Cars c = new Cars();
	  }      

}



