package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student{
	public
		int rollNo;
		String Name;
		String course;
		
	Student(int r,String n,String c){
		this.rollNo = r;
		this.Name = n;
		this.course = c;
	}
}
public class ArrayListImplementation {
	
	
	
	/*public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(100);
		arr.add(1000);
		arr.add(10000);
		System.out.println(arr);
		
		
		ArrayList<Integer> newList = new ArrayList<>();
		newList.add(25);
		newList.add(35);
		newList.add(45);
		
		ArrayList<Integer> newList1 = new ArrayList<>();
		newList1.add(55);
		newList1.add(65);
		newList1.add(75);
		ArrayList<Integer> newList2 = new ArrayList<>();
		newList2.add(85);
		newList2.add(95);
		newList2.add(105);
		
		arr.addAll(newList);
		System.out.println(arr);
		
		arr.add(1,125);
		System.out.println(arr);
		
		System.out.println(arr.get(0));
		
		
		System.out.println("Enter your Number and String");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		System.out.println(n+" "+s);
		
		
		System.out.println();
		System.out.println(arr.get(0));
		for(int i=0;i<3;i++) {
			System.out.print(arr.get(i)+" ");
		}
		
				
	
		
	}*/
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		int n;
		System.out.println("Enter a number");
		System.out.println();
		
		Scanner sc =  new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
//			b.add(sc.nextInt());
		}
		for(int i=0;i<n;i++) {
			System.out.println(a.get(i));
		}
		System.out.println(a);
		a.add(0,48);
		System.out.println(a);
		a.set(0,102);
		System.out.println(a);
		a.addAll(b);
		System.out.println(a);
		a.addAll(2,b);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.lastIndexOf(25));
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println(a.contains(25));
		System.out.println(a.indexOf(1));
		a.remove(1);
		System.out.println(a);
//		a.removeAll(a);
		System.out.println(a);
		Iterator it  =a.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Integer i:a) {
			System.out.println(i);
		}
		
		Collections.sort(a);
		
		System.out.println(a);
		a.forEach(ac->{
			System.out.println(ac);
		});
		
		
		
		System.out.println("Student list with course");
		ArrayList<Student> Student_list  =new ArrayList<>();
		Student st = new Student(1,"Devendra Kumar","B.tech");
		Student st1 = new Student(10,"Dheeraj Patel","B.tech");
		Student st2 = new Student(100,"Vipin Kumar","B.tech");
		Student st3 = new Student(1000,"Puneet Kumar","B.tech");
		Student st4 = new Student(10000,"Abdhesh Kumar","B.tech");
		Student_list.add(st);
		Student_list.add(st1);
		Student_list.add(st2);
		Student_list.add(st3);
		Student_list.add(st4);
		System.out.println(Student_list);
		Student_list.forEach(at->{
			System.out.println(at.rollNo+" "+at.Name+" "+at.course);
		});
		
	}

}
