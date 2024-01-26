package com.abstraction;
public abstract class Bike {

	String color = "Red";
	Bike(){
		System.out.println("Bike is Created");
	}
	void changeGear() {
		System.err.println("Gear is changed ");
	}
	abstract void run();
}


class Honda extends Bike{
	void run() {
		System.out.println("The Speed limit of the honda bike is 100kmh");
	}
}
class Splendor extends Bike{
	void run() {
		System.out.println("The Speed limit of the Splendor bike is 80kmh");
		System.out.println("Color is " + color);
	}
	void changeGear() {
		System.out.println("Gear of this bike is changed");
	}
}

class Pulsor extends Bike{
	void run() {
		System.out.println("The Speed limit of the Pulsor bike is 120kmh");		
	}
	
}