package com.accessModifier;

public class A {

	public int a=10;
	private void msg() { 
		System.out.println("Hello Devendra Kumar ");
		}
	public void GreetMsg() {		
		System.out.println("Your Serial Number is " + a);
		msg();
	}
}

class Simple{
	public static void main(String[] args) {
		A a = new A();
		a.GreetMsg();
		
	}
}
