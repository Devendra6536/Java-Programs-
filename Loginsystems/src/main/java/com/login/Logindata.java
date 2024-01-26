package com.login;

import java.sql.*;

public class Logindata {
	public boolean getconn(String name,String email,String Password) {

		Connection connection =null;
		boolean status = false;
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
							
						if(rs.getString(1).equalsIgnoreCase(name) && rs.getString(2).equalsIgnoreCase(email)
								&& rs.getString(3).equalsIgnoreCase(Password))
						{
							status =rs.next();
						}
					
					}
			}
		
		catch(Exception e)
		{
			System.out.println(e);			
		}
		return status;
	}
	
	
	
/*public static void main(String[] args) {
		Logindata l = new Logindata();
		if(l.getconn("Devendra Kumar","email@email.com","cse2")) {
			  System.out.println("Connection established ");
                System.out.println("Please wait....");
                   
            } 
			else
			{
                System.out.println("Connection Failed");
            }
		
}*/
}

