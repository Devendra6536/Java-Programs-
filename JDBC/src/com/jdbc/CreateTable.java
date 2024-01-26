package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {

	
	
	public void creatTable(Connection connection) {
		
		try {
			Statement st = connection.createStatement();
			String sql = "CREATE TABLE STUDENT(Name TEXT,RollNo INT  NOT NULL, Section CHAR(10))";
			st.executeUpdate(sql);
			st.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Table created succesfully");
		
	}
}
