package com.string;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Devendra Kumar pal";
		System.out.println("Char at index 7 is " + s.charAt(8));
//		public char charAt(int index)
		for(int i=0;i<s.length();i++) System.out.print(s.charAt(i));
		System.out.println();
		for(int i=0;i<s.length();i++) 
			{
				if(i%2==0) System.out.print(s.charAt(i));
			}
		
		System.out.println();
		
		
		String s1 = "Hello";
		String s2 = "world";
		System.out.println(s1.compareTo(s2));
		
		String s3 = "";
		System.out.println(s3.compareTo(s1));
		
		
		String s4 = "IMS Engineering College Ghaziabad uttar pradesh india 243722";
		if(s4.contains("Allahabad")) System.out.println("Present");
		else System.out.println("Result not found");
		System.out.println(s4.indexOf("Engi"));
		System.out.println(s4.indexOf(67));
		
		
		String s5  = "devendrapal8682@gmail.com";
		System.out.println(s5.endsWith(".com"));
		System.out.println(s5.endsWith(""));
		
		
		
		
		char[] ch = new char[10];
		s5.getChars(0, 10, ch, 0);
		for(char c: ch) {
			System.out.print(c);
		}
		
		String ss = "Hello World";
		String[] s6 = ss.split(" ");
		for(String it:s6) {
			System.out.println(it);
		}
		
		
		
	}
	
}
