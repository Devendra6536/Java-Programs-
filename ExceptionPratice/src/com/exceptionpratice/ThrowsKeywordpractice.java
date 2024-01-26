package com.exceptionpratice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeywordpractice {	
	public static void method() throws FileNotFoundException,ArithmeticException {
		float a  = 10/0;
		FileReader fw = new FileReader("C:\\Users\\Dell\\Desktop\\Python practice\\file.txt");
//		throw new FileNotFoundException();
		throw new ArithmeticException();
		
	}
	
	public static void main(String[] args) {
		try {
			method();
		}
		catch(Exception e) {
//			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}



