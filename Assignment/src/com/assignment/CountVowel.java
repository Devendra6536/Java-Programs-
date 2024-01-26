package com.assignment;

import java.util.Scanner;

public class CountVowel {

	/*public int countVowel(String s) {
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' 
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U')
				cnt++;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		CountVowel c=new CountVowel();
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter A string\n");
		String string = s.nextLine();
		
		System.out.println("The Total no of Vowel in the string = " + c.countVowel(string));
	
		
		
		
		System.out.printf("%-10.10s %s -10.10s %s\n", "Name","RollNO","Section");
		
	}*/
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the no of row and column");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				if(i==1 || i==n || j==1 || j==n)
				{
					System.out.println("*");
				}
				else
				{
					System.out.println(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
