package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcConnection {

	public Connection getConnection() {
		Connection connection = null;
		String host="localhost";
        String port="5432";
        String db_name="Student";
        String username="postgres";
        String password="4512";
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://"+host+":"+port+"/"+db_name+"", ""+username+"", ""+password+"");
//			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Student","postgres","4512");
				if (connection != null) 
				{
	                System.out.println("Connection established ");
	                System.out.println("Please wait....");
	                Thread.sleep(2000);
	                
	            } 
				else
				{
	                System.out.println("Connection Failed");
	            }
			
			}
		catch(Exception e)
		{
			System.out.println(e);			
		}
		return connection;
	}
	
}
