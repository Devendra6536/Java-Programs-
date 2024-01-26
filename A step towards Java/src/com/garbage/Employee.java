package com.garbage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {
public void finalize() {
	System.out.println("The Object is Grabage Collected");
}
	public static void main(String[] arg) {
		Employee e = new Employee();
		Employee e1 = new Employee();
		System.out.println(System.currentTimeMillis());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
		e = null;
		e1 = null;
		System.gc();
		
		
	}
}
