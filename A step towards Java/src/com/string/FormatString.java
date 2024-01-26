package com.string;

public class FormatString {

	public static void main(String[] args) {
		String st = "Devendra Kumar Pal";
		System.out.println(String.format("%s", st));
		System.out.println(String.format("%d", 80));
		System.out.println(String.format("%.3f", 10.0));
		System.out.println(String.format("%10.3f", 100.2021));
		System.out.println(String.format("|%10d|", 125));
		
		System.out.println(String.format("|%010d|", 125));
		String greet =  "Hello Guys | How are you ";
		System.out.println(String.format("%30d", 458));
		System.out.println(String.format("%n", 122));
	}
}
