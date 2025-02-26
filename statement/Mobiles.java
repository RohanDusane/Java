package com.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mobiles {
	
	public void createTable() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
        Statement s = c.createStatement();
        s.executeUpdate("create table Mobiles (id INT PRIMARY KEY AUTO_INCREMENT, color VARCHAR(50), model VARCHAR(50), price INT)");
        System.out.println("Mobiles table created successfully...");
        c.close();
    }
	
	 public void insertMobiles() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        Statement s = c.createStatement();
	        s.executeUpdate("INSERT INTO Mobiles (color, model, price) VALUES ('black', 'samsung', 80000)");
	        s.executeUpdate("INSERT INTO Mobiles (color, model, price) VALUES ('white', 'apple', 1000000)");
	        s.executeUpdate("INSERT INTO Mobiles (color, model, price) VALUES ('red', 'vivo', 30000)");
	        s.executeUpdate("INSERT INTO Mobiles (color, model, price) VALUES ('grey', 'one plus', 25000)");
	        s.executeUpdate("INSERT INTO Mobiles (color, model, price) VALUES ('yellow', 'realme', 20000)");
	        System.out.println("Mobiles data inserted successfully");
	        c.close();
	 }
	 
	 public void updateMobiles() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        Statement s = c.createStatement();
	        s.executeUpdate("UPDATE Mobiles SET price=56000 WHERE model='vivo'");
	        System.out.println("Mobiles updated successfully...");
	        c.close();
	    }

	    public void deleteMobiles() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        Statement s = c.createStatement();
	        s.executeUpdate("DELETE FROM Mobiles WHERE model='one plus'");
	        System.out.println("Mobiles deleted successfully...");
	        c.close();
	    }

	    public void selectMobiles() throws Exception {
	        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
	        Statement s = c.createStatement();
	        ResultSet rs = s.executeQuery("SELECT * FROM Mobiles");
	        while (rs.next()) {
	            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
	        }
	        c.close();
	    }
	    
	    public static void main(String[] args) throws Exception {
			Mobiles b = new Mobiles();
	  }      

}



