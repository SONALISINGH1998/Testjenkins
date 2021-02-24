package com.cts.jfs.phase1.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
   
    	public static void main(String[]args) throws ClassNotFoundException, SQLException {
   		 Class.forName("com.mysql.cj.jdbc.Driver");
   		 System.out.println("Driver class loaded");
   		 String url="jdbc:mysql://localhost:3306/classicmodels";
   		 String username="root";
   		 String password="sona123@akku";
   		 Connection connection=DriverManager.getConnection(url,username,password);
   		 System.out.println("connected...to mysql");
   		 System.setProperty("Jdbc.drivers", "com.mysql.jdbc.Driver");
   		
    }
}
