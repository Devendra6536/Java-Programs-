package com.abstraction;
interface Printable {
	void print();
	void printGreeting();

}
class A implements Printable{
	public void print() {
		System.out.println("Hello Devendra kumar pal ");
	}

	@Override
	public void printGreeting() {
		// TODO Auto-generated method stub
		System.out.println("Good Morning Devendra kumar pal ");
		
	}
	
	public static void main(String[] args) {
		new A().printGreeting();
		new A().print();
	}
}
