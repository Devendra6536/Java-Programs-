package com.runtimePolymorsim;

public class Bike {

	void run() {
		System.out.println("Running");
	}
}

class Splendor extends Bike{
	void run() {
	   System.err.println("Running Safely with 60kmh ");
	}
	
	public static void main(String[] args) {
		Bike b = new Splendor(); //this is upcasting
		b.run();
	}
}
