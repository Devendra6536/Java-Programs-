package learnJava;

public class Student {

	String name;
	int id;
	String collegeName = "IMS Engineering College Ghaziabad";
	
	public Student(String n, int i) {
		// TODO Auto-generated constructor stub
		name = n;
		id = i;
		
	}
	Student(Student s){
		name = s.name;
		id = s.id;
	}
	public void showData() {
		System.out.println("Your name is " + name + "And Your id is " + id+" College "+ collegeName);
	}
	
	static {
		System.out.println("Bye Devendra kumar ");
	}
	
	static class Example{
		public static String name = "Vipin Pal";
	}
}
