package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {
	
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		PreparedStatement ps = c.prepareStatement("INSERT INTO student VALUE(?, ?, ?)");
		ps.setInt(1, 1);
		ps.setString(2, "jecika");
		ps.setString(3, "chennai");
		ps.executeUpdate();
		
		ps.setInt(1, 2);
		ps.setString(2, "marry");
		ps.setString(3, "kashmir");
		ps.executeUpdate();
		
		ps.setInt(1, 3);
		ps.setString(2, "john");
		ps.setString(3, "dubai");
		ps.executeUpdate();
		
		ps.setInt(1, 4);
		ps.setString(2, "samir");
		ps.setString(3, "Delhi");
		ps.executeUpdate();

		System.out.println("data is Inserted successfully...");
		c.close();
	}

	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		PreparedStatement ps = c.prepareStatement("UPDATE student SET name=? WHERE id=?");
		ps.setInt(1, 2);
		ps.setString(1, "lucky");
		ps.executeUpdate();

		System.out.println("data is Updated succesfully...");
		c.close();
	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		PreparedStatement ps = c.prepareStatement("DELETE FROM students WHERE id = ?");
		ps.setInt(1, 2);
		ps.executeUpdate();

		System.out.println("data is Deleted successfully...");
		c.close();
	}

	public void selectData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		PreparedStatement ps = c.prepareStatement("SELECT * FROM student");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}

		c.close();
	}
}


