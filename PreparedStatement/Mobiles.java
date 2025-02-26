package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.tka.Mobiles;

public class Mobiles {
	
	public void createTable() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
        PreparedStatement ps = c.prepareStatement("create table Mobiles (id INT PRIMARY KEY AUTO_INCREMENT, color VARCHAR(50), model VARCHAR(50), price INT)");
        ps.executeUpdate();
        System.out.println("Mobiles table created successfully...");
        c.close();
    }
	
	 public void insertMobiles() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        PreparedStatement ps = c.prepareStatement("INSERT INTO Mobiles (color, model, price) VALUES (?,?,?)");
	        
	        ps.setString(1, "black");
	        ps.setString(2, "samsung");
	        ps.setInt(3, 80000);
	        ps.executeUpdate();
	        
	        ps.setString(1, "white");
	        ps.setString(2, "apple");
	        ps.setInt(3, 1000000);
	        ps.executeUpdate();
	        
	        System.out.println("Car inserted successfully");
	        c.close();
	    }
	       
	 
	 public void updateMobiles() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        PreparedStatement ps = c.prepareStatement("UPDATE Mobiles SET price=? WHERE model=?");
	        ps.setInt(1, 56000);
	        ps.setString(2, "vivo");
	        ps.executeUpdate();
	        System.out.println("Mobiles updated successfully...");
	        c.close();
	    }

	    public void deleteMobiles() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        PreparedStatement ps = c.prepareStatement("DELETE FROM Mobiles WHERE model=?");
	        ps.setString(1, "vivo");
	        ps.executeUpdate();
	        System.out.println("Mobiles deleted successfully...");
	        c.close();
	    }

	    public void selectMobiles() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        PreparedStatement ps = c.prepareStatement("SELECT * FROM Mobiles");
	        ResultSet rs = ps.executeQuery();
	        while (rs.next()) {
	            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
	        }
	        c.close();
	    }
	    
	    public static void main(String[] args) throws Exception {
			Mobiles b = new Mobiles();
	  }      

}






