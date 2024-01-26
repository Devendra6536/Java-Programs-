package com.jdbc;

import java.sql.Connection;
import java.util.Scanner;

public class DBInterface {
public static void main(String[] args) {
	
					Connection conn = null;
					JdbcConnection j = new JdbcConnection();
					conn = j.getConnection();
					
					
					Scanner sc = new Scanner(System.in);
		while(true) {
					System.out.println("\n\n\n");
					System.out.println("\t\t\t------------------");
					System.out.println("\t\t\t|Enter your choice|");
					System.out.println("\t\t\t------------------");
					
					System.out.println("Press: 1 for Create the table");
					System.out.println("Press: 2 for Insert the data into  the table");
					System.out.println("Press: 3 for See the data ");
					System.out.println("Press: 4 for Delete the the data ");
					int n = sc.nextInt();
					
					
					switch (n) {
					case 1: 
					{
						CreateTable c = new CreateTable();
						c.creatTable(conn);
						break;
					}
					
					case 2:
					{
						InsertData i  = new InsertData();
						i.insertRecord(conn);
						break;
					}
					
					case 3: {
						FetchData f = new FetchData();
						f.fetchRecord(conn);
						break;
					}
					case 4: 
					{
						DeleteDatafromTable d =new DeleteDatafromTable();
						d.deleteRecord(conn);
						break;
					}
					
					default:
						throw new IllegalArgumentException("Unexpected value: " + n);
					}
	}
}
}
