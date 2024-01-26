package com.exceptionpratice;

import java.io.PrintWriter;

public class ExceptioPratice {

	public static void main(String[] args) {

		int n=90;
		try {
			
			int z = n/0;
			System.out.println(z);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Number is not divided by zero");
		}	
		int age=10;
		try {
		if(age<18) {
			throw new ArithmeticException("You are not eligible for vote");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
//		ArrayIndexOutOfBoundsException
		/*try {
		int[] ch = {1,2,3};
			ch[5] = 15;
			System.out.println(ch[5]);
		}
		catch( ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}


//		NullPointerException
		try {
			 String s = null;
			System.out.println(s.length());
			}
			catch(Exception e) {
				System.out.println(e);
			}

//
		try {
			PrintWriter pw = new PrintWriter("ile.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 System.out.println(e);
		}

//	NumberFormatException
		try {
		String s = "abc";
		int i = Integer.parseInt(s);
		System.out.println(i);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
	}
}


