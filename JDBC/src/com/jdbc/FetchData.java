package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchData {
	
	
	public void fetchRecord(Connection connection) {
		try {
			Statement st = connection.createStatement();
			String sql = "SELECT * FROM STUDENT ";
			
			ResultSet rs  = st.executeQuery(sql);
			
			System.out.println("The fetched data is :  ");
			Thread.sleep(2000);
			
			System.out.println("------"+ "    \t"+"--------"+"    "+ "---------");
			System.out.println("|Name| "+ "   "+"\t|RollNo|"+"    "+ "|Section|");
			System.out.println("------"+ "    "+"\t-------"+"     "+ "--------");
				while(rs.next())
				{
					System.out.println(rs.getString(1)+ "  \t  "+rs.getInt(2)+" \t     " + rs.getString(3));
					
				} 
		
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
	}

}

