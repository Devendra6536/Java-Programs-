package Inheritance;

public class Animal {

	void eating() {
		System.out.println("Animal is eating ");
	}
	void quality() {
		System.out.println("Animal has 4 legs");
	}
}

class AnimalQuality{
	String Name;
	int legsCount;
	int Age;
	String Color;
	void display() {
		System.out.println("Name of the Animal is " + Name);
		System.out.println("Age of the Animal is " + Age);
		System.out.println("How Many legs have this animals " + legsCount +" legs");
		
	}
}

class Dog extends Animal{
	void barking() {
		System.out.println("Dog is barking");
	}
}
class BabyDog extends Dog{  
void weep(){
	System.out.println("weeping...");
	}  
} 

class Cat extends Animal{
	void meow() {
		System.out.println("Meowing");
	}
}

class Ox extends AnimalQuality{
	Ox(String Name,int age,int legsCount){
		this.Name = Name;
		this.Age = age;
		this.legsCount = legsCount;
	}
}
class ImplementSingleLevelInheritance{
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.barking();
		d1.eating();
		d1.quality();
		BabyDog b1 =  new BabyDog();
		b1.weep();
		Dog b2 =  new BabyDog();
		b2.barking();
		Cat c1 = new Cat();
		c1.meow();
		
		
		new Ox("Ox",12,4).display();
		new Ox("Ox",12,4).display();
	}
}
