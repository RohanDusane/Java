package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.tka.Schools;

public class Schools {
	
	public void createTable() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
        PreparedStatement ps = c.prepareStatement("CREATE TABLE Schools (rank INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), city VARCHAR(50), principle varchar(30))");
        ps.executeUpdate();
        System.out.println("Schools table created successfully");
        c.close();
    }

    public void insertSchools() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
        PreparedStatement ps = c.prepareStatement("INSERT INTO Schools(name, city, principle) VALUES (?,?,?)");
        
        ps.setString(1, "senteresa");
        ps.setString(2, "mumbai");
        ps.setString(3, "rubina");
        ps.executeUpdate();
        
        ps.setString(1, "Bhagirath");
        ps.setString(2, "pune");
        ps.setString(3, "farukh");
        ps.executeUpdate();
        
        System.out.println("Schools data inserted successfilly...");
        c.close();
        
    }

    public void updateSchools() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
        PreparedStatement ps = c.prepareStatement("Update Schools SET city =? WHERE name=?");
        ps.setString(1, "lonavla");
        ps.setString(2, "Bhagirath");
        ps.executeUpdate();
        System.out.println("Schools updated successfully");
        c.close();
    }

    public void deleteSchools() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
        PreparedStatement ps = c.prepareStatement("DELETE FROM Schools WHERE name=?");
        ps.setString(1, "senteresa");
        ps.executeUpdate();
        System.out.println("Schools deleted successfully");
        c.close();
    }

    public void selectSchools() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
        PreparedStatement ps = c.prepareStatement("SELECT * FROM Schools");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
        }
        c.close();
    }
    
    public static void main(String[] args) throws Exception {
		Schools s = new Schools();

}
}



