package com.abstraction;

public class BikeSpeedChecker {

	public static void main(String[] args) {
		Bike b  = new Honda();
		b.run();
		b.changeGear();
		
//		Splendor bike implementation 
		Bike s = new Splendor();
		s.run();
		s.changeGear();
	}
}
