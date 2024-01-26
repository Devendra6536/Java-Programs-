package com.objectCloning;

public class Student implements Cloneable {

	String Name;
	int RollNo;
	Student(String name,int rollNo){
		this.Name = name;
		this.RollNo = rollNo;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class Hod{
	public static void main(String[] args) {
		try {
			Student s = new Student("Devendra",73);
			Student s1 = (Student)s.clone();
			
			System.out.println("Name: "+s.Name+"RollNo: " + s.RollNo);
			System.out.println("Name: "+s1.Name+"RollNo: " + s1.RollNo);
		}
		catch(Exception e) {
			System.err.println(e);
		}
	}
}
