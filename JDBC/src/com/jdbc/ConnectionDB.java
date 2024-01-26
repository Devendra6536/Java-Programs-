package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDB {	
	public static void main(String[] args) {
		
//		this is server name
		String server = "localhost";
//		this is port address
		String port   = "5432";
//		this is Database name
		String dbase_name = "Student";
//		this is user name
		String username = "postgres";
//		this is Password of the Database
		String password = "4512";
		
//		now establish a connection to the database
		try {
				Class.forName("org.postgresql.Driver");
//				Connection  conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Student","postgres","4512");
				Connection connection = DriverManager.getConnection("jdbc:postgresql://"+server+":"+port+"/"+dbase_name+"", ""+username+"",""+password+"");
				
//				check the connection
				if (connection != null){System.out.print("Connection established : Please wait.....\n");Thread.sleep(2000);} 
				else{System.out.println("Connection Failed");}
				
				
				/*Statement st1 = connection.createStatement();
				String sql = "CREATE TABLE student " +
			            "(" +"NAME TEXT    NOT NULL, " +
			            " ROLLNO           INT     NOT NULL, " +
			            " SECTION   CHAR(50))";
				st1.executeUpdate(sql);
				st1.close();
				connection.close();*/
				
				/*Statement st2 = connection.createStatement();
				String sql1 = "INSERT INTO student (NAME,ROLLNO,SECTION) "
			            + "VALUES ('Devendra', 73, 'CSE2' );";
			         st2.executeUpdate(sql1);*/
				
				
				Statement st3 = connection.createStatement();
				String sql = "SELECT * FROM STUDENT";
				ResultSet rs = st3.executeQuery(sql);
				
				while(rs.next()) {
					System.out.println(rs.getString(1)+ " "+rs.getInt(2)+" " + rs.getString(3));
					
				} 
			         
	
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
}
