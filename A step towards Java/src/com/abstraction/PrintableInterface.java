package com.abstraction;

// multiple inheritance 
interface PrintableInterface {
	void print();
}
interface Showable{
	void print();
}
class Greet implements PrintableInterface,Showable{
	public void print() { System.out.println("Hello Devendra kumar");}
}

class Implementation{
	public static void main(String[] args) {
		PrintableInterface p = new Greet();
		p.print();
	}
}
