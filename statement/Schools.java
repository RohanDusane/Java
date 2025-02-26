package com.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Schools {
	
	public void createTable() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
        Statement s = c.createStatement();
        s.executeUpdate("CREATE TABLE Schools (rank INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), city VARCHAR(50), principle varchar(30))");
        System.out.println("Schools table created successfully");
        c.close();
    }

    public void insertSchools() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
        Statement s = c.createStatement();
        s.executeUpdate("INSERT INTO Schools (name, city, principle) VALUES ('Senteresa', 'mumbai', rubina)");
        s.executeUpdate("INSERT INTO Schools (name, city, principle) VALUES ('Bhagirath', 'pune', farukh)");
        s.executeUpdate("INSERT INTO Schools (name, city, principle) VALUES ('Orion', 'nashik', anjali)");
        s.executeUpdate("INSERT INTO Schools (name, city, principle) VALUES ('Sentlawrence', 'chennai', sarupia)");
        s.executeUpdate("INSERT INTO Schools (name, city, principle) VALUES ('Sentjoseph', 'banglore', john)");
        System.out.println("Schools data inserted successfully");
        c.close();
    }

    public void updateSchools() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
        Statement s = c.createStatement();
        s.executeUpdate("UPDATE Schools SET name=KCE WHERE name='Bhagirath'");
        System.out.println("Schools data updated successfully");
        c.close();
    }

    public void deleteSchools() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
        Statement s = c.createStatement();
        s.executeUpdate("DELETE FROM Schools WHERE city='nashik'");
        System.out.println("Schools deleted successfully");
        c.close();
    }

    public void selectSchools() throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM Schools");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
        }
        c.close();
    }
    
    public static void main(String[] args) throws Exception {
		Schools b = new Schools();

}
}
