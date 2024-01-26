package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteDatafromTable {

	public void deleteRecord(Connection connection) {
		
		try {
			Statement st =connection.createStatement();
			String s = " DELETE FROM student WHERE RollNo = 4514";
			st.executeUpdate(s);
			System.out.println("the record is successfully deleted!... ");
			st.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	 
}
