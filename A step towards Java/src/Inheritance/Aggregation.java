package Inheritance;

public class Aggregation {
	Aggregation(){
		System.out.println("Hello");
	}

}
class Operation{
	String name;
	int Age;
	Operation(String Name,int age){
		name = Name;
		Age = age;
	}
	void display() {
		System.out.println("Hello Devendra kumar pal");
	}
}
class Operations{
	Operation op = new Operation("Devendra Kumar ", 20);
	void displayData() {
			System.out.println(op.name);
			System.out.println(op.Age);
			op.display();
	}
	
}
class Implementation{
	public static void main(String[] args) {
		Operations op1 = new Operations();
		op1.displayData();
	}
}
