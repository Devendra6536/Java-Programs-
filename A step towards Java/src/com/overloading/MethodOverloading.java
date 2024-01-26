package com.overloading;

//Method overloading with type promotion
public class MethodOverloading {

	static void add(int a,int b) {
		System.out.println("Int vala chala hai");
		System.out.println(a+b);
	}
	static void add(long a,long b) {
		System.out.println("long vala chala hai");
		System.out.println(a+b);
	}
	static void add(double a,double b) {
		System.out.println("Double vala chala hai");
		System.out.println(a+b);
		System.out.println(194/2);
	}
	
	public static void main(String[] args) {
		MethodOverloading.add(10,20);
		MethodOverloading.add(25.0, 45.12);	
		MethodOverloading.add('a','a');	
		
		
	}
}
