package com.superKeyword;

public class Animal {
	String Color = "white";
	void printcolor() {
		System.out.println("The Color of the Animal is " + Color);
	}
	Animal(){
		System.out.println("Animal is created");
	}
}
class Dog extends Animal{
	String Color = "black";
	
	Dog(){
		super();
		System.out.println("DOg is created ");
	}
	void printColor() {
		
//		System.out.println("The Color of the Dog is " + Color);
		super.printcolor();
		System.out.println("The Color of the Animal is " +super.Color);
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.printColor();
	}
}
