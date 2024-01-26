package com.exceptionpratice;

import java.util.Scanner;

public class ThrowKeyworPratice {
	public static void validate(int age) {
		age>18 ? System.out.println("Elegible"): System.out.println("Note Eligible"); 
		if(age<18) {
//			throw new ArithmeticException("You are not eleigible for voting");
			throw new ArithmeticException("Le yrr \"Devendra\"  you are not eleigible for voting");
			
		}
		else {
			System.out.println("Person is eligible for vote");
		}
		
		System.out.println("Rest of the code");
	}
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter your ages");
		int age = n.nextInt();
		validate(age);
	}
}
