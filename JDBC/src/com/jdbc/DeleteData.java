package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteData {
	public static void main(String[] args) {

		Connection connection=null;
		JdbcConnection obj_conn = new JdbcConnection();
		connection= obj_conn.getConnection();
		
		try {
			Statement st = connection.createStatement();
			String sql = "DELETE FROM STUDENT WHERE RollNo=73";
		    st.executeUpdate(sql);
			st.close();
			
			System.out.println("Record deleted Successfully");
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		}

}
