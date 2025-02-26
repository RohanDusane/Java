package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.tka.Laptops;

public class Laptops {
	
	public void createTable() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
        PreparedStatement ps = c.prepareStatement("create table Laptops (id INT PRIMARY KEY AUTO_INCREMENT, color VARCHAR(50), model VARCHAR(50), price INT)");
        ps.executeUpdate();
        System.out.println("Laptops table created successfully...");
        c.close();
    }
	
	 public void insertLaptops() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        PreparedStatement ps = c.prepareStatement("INSERT INTO Laptops (color, model, price) VALUES (?,?,?)");
	        
	        ps.setString(1, "black");
	        ps.setString(2, "dell");
	        ps.setInt(3, 80000);
	        ps.executeUpdate();
	        
	        ps.setString(1, "white");
	        ps.setString(2, "lenovo");
	        ps.setInt(3, 70000);
	        ps.executeUpdate();
	        
	        System.out.println("Laptops inserted successfully");
	        c.close();
	    }


	     public void updateLaptops() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        PreparedStatement ps = c.prepareStatement("UPDATE laptops SET price=? WHERE model=?");
	        ps.setInt(1, 30000);
	        ps.setString(2, "dell");
	        ps.executeUpdate();
	        System.out.println("Laptops updated successfully...");
	        c.close();
	    }

	    public void deleteLaptops() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        PreparedStatement ps = c.prepareStatement("DELETE FROM Laptops WHERE model=?");
	        ps.setString(1, "Lenovo");
	        ps.executeUpdate();
	        System.out.println("Laptops deleted successfully...");
	        c.close();
	    }

	    public void selectLaptops() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        PreparedStatement ps = c.prepareStatement("SELECT * FROM Laptops");
	        ResultSet rs = ps.executeQuery();
	        while (rs.next()) {
	            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
	        }
	        c.close();
	    }
	    
	    public static void main(String[] args) throws Exception {
			Laptops b = new Laptops();
	  }      

}






