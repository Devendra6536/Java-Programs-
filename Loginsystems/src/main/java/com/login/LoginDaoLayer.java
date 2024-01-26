package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class LoginDaoLayer {

	public static void main(String[] args) {
		Connection connection =null;

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/users","postgres","4512");
			Statement st = connection.createStatement();
			String Sql = "SELECT * FROM public.users where email='email@email.com';";
			ResultSet rs= st.executeQuery(Sql);
			
				while(rs.next())
				{
					System.out.println(rs.getString(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
				}
		
			}
		catch(Exception e)
		{
			System.out.println(e);			
		}
	}
	
}
