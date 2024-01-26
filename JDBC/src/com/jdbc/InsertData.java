package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {
	
	public void insertRecord(Connection connection) {
		try {		
			Statement st = connection.createStatement();
//			insert 1st data
			/*Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name : ");
			String name = sc.nextLine();
			
			System.out.println("Enter your RollNo : ");
			int RollNo = sc.nextInt();
			
			System.out.println("Enter your Section : ");
			char section = sc.ch();*/
			
			String sql = "INSERT INTO STUDENT(Name, RollNO, Section)"+ " VALUES('Rajiv pal','4637','CSE3');";
			st.executeUpdate(sql);

//			insert 2nd data
			String sql1 = "INSERT INTO STUDENT(Name, RollNO, Section)"+ " VALUES('Yogesh pal','4587','CSE4');";
			st.executeUpdate(sql1);
			st.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Data inserted Successfully");
	}
	
}
