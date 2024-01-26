package com.assignment;
import java.util.StringJoiner;

import javax.print.attribute.standard.PrinterMessageFromOperator;
public class Example {

	public static void reverse(String s) {
		String rev = "";
		for(int i=0;i<s.length();i++) {
			rev = s.charAt(i)+rev;
		}
		System.out.println(rev);
	}
	
	
	public static void main(String[] args) {
//		Char to string conversion
		char ch[] = {'i','m','s','e','c','2'};
		String s = new String(ch);
		
		System.out.println(s);
		s=s.concat("3rd year");
		System.out.println(s);
			
//	string comparision	
//		by equals() method
		String a= "Devendra";
		String b= "Devendra";
		String d= "Devendra kumar ";
		String c= new String("Devendra");

		 System.out.println(a.equalsIgnoreCase(b));
		 System.out.println(a.equalsIgnoreCase(c));
		 System.out.println(a.equalsIgnoreCase(d));
		 
//		by == operator 
		 String s1= "ABdesh";
		 String s2= "ABdesh";
		 String s3 = new String("ABdesh");
		 System.out.println(s1==s2);
		 System.out.println(s2==s3);
		  
//		 by compareTo() method
		 String s4= "IMs enginnnering college ghaziaba uttar";
		 String s5= "Yatra";
		 System.out.println(s5.compareTo(s4));
		 
		 
//		 String Concatenation
		 
		 String s6= "ABdesh" + "Pal";
		 System.out.println(s6);
		 
		 String s7 = "Dk";
		 System.out.println(s7.concat(" Pal "));
		 
//		 StringBuilder class		 
		 StringBuilder s8 = new StringBuilder("Hello");
		 StringBuilder s9 = new StringBuilder(" Devendra");
		 StringBuilder s11 = new StringBuilder(" Kumar");
		 
		 StringBuilder s10 =   s8.append(s9);
		 System.out.println(s10);
		 StringBuilder s12 =   s10.append(s11);
		 System.out.println(s10);
		 System.out.println(s12);
		 
//		 by String.format() method
		 String s13 = "Dk";
		 String s14 = " Pal";
		 String s15 = String.format("%s%s%d", s13,s14,12);
		 System.out.println(s15.toString());
		 
//		 by join method
		 String s19 = " Garhi";
		 String s20 = "Khanpur";
		 
		 String s16 = String.join("", s13,s14,s19,s20);
		 System.out.println("The result is :: "+ s16);
		 
//		 by StringJoiner method
		StringJoiner  s17 = new StringJoiner(".");
		s17.add("www");
		s17.add("Yatra");
		s17.add("com");
		System.out.println("The Resultant string is :: "+s17);
		
//	subString method 
		String s18 = new String("Devendra kumar pal garhkhanpur budaun uttar pradesh india- 202523");
		System.out.println(s18.substring(2));
		System.out.println("The substring b/w 0 to 8 char :: "+s18.substring(0, 8).toUpperCase());
		
		
	 String ss=new String(" Devendra ");
	 System.out.println(ss);
	 System.out.println(ss.trim());
	 
	 double ad = 001;
	 String ss1 = String.valueOf(ad);
	 System.out.println(ss1);
	 System.out.println(ss1+". dk pl");
	 
	 
//	 replace method
	 String  ss2 = "Java is best for Java developers.Java is world most famous. ";
	 String ss3 = ss2.replace("Java", "Baba");
	 System.out.println(ss3);
	 
	 String ss4 = "dk";
	 String ss5 = "pal";
	 String ss6 = ss4+ss5;
	 System.out.println(ss4.hashCode());
	 System.out.println(ss5.hashCode());
	 System.out.println(ss6.hashCode());
	 
	 
	 
	 
	 char chh[]={'a','A','m','k'};
		for( int p:chh)  // for each loop a 97  A 65
		{
			  char w=(char)p;
			  System.out.println(w);
		}
		
		
		
		char[] t = ss4.toCharArray();
		System.out.println(t);
		
		
		
		String d1="one,two,three,four";
		  String[] y = d1.split(",");
		  
		  for(String r:y) {
			  System.out.println(r);
		  }
		  reverse("ardneved");
		  
		 
		  
		  
		}
	
	
}
