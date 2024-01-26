package com.assignment;

public class Question {

//	1.first question for count the words in a string
	public int countWords(String s) {
		int count=1;
		for(int i=0;i<s.length();i++) {
			
			if( s.charAt(i) == ' '  && s.charAt(i+1)!=' ')
				count++;
				
		}
		return count;		
	}
	
//	2.Second Question  for reverse a string
	public String revString(String s) {
		String S = new String();
		for(int i=s.length()-1;i>=0;i--) {
			 S += s.charAt(i);
		}
		return S;
	}
	
//	3.Third question for count the no of vowel in a string 
	 public int noOfVowel(String s) {
		 int count=0;
			for(int i=0;i<s.length();i++) {
				
				if(      s.charAt(i) == 'A'  || s.charAt(i) == 'E' || s.charAt(i) == 'I'
						||s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a'
						|| s.charAt(i) == 'e'|| s.charAt(i) == 'i' || s.charAt(i) == 'o' 
						|| s.charAt(i) == 'u')
					count++;
					
			}
			return count;	
	 }
	 
//	 4.sqrt of a number
	 public double sqrt_Of_No(int n) {
		 
		 
		 if(n==1 || n==0)
			 return n;
		 int i=1,result=1;
		 while(result<=n) {
			 i++;
			 result = i*i;
		 }
		 return i-1;
	 }
	 
//	 5. Cube root of a number
public double cubeRoot_Of_No(int n) {
		 
		 
		 if(n==1 || n==0)
			 return n;
		 int i=1,result=1;
		 while(result<=n) {
			 i++;
			 result = i*i*i;
		 }
		 return i-1;
	 }
	
//   remove whitespace from a string
	public String removewhiteSpace(String s)
	{
		String S = new String();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) ==' ')
				continue;
			else
				S+=s.charAt(i);
		}
		return S;
	}
	
	public static void aiseHi() {
		System.out.println("This is static");
	}

	 
	public static void main(String[] args) {
		Question q1 = new Question();
//		this is for count the words in a string 
		int num_of_words = q1.countWords("IMS Engineering college ghaziabad uttar pradesh india");
		System.out.println(num_of_words);
//		this is for reverse the string
		System.out.println(q1.revString(" RAMUK ARDNEVED"));
		
//		for count the no of vowel in a string 
		System.out.println(q1.noOfVowel("AEIOU")); 
//		sqroot of a number
		System.out.println(q1.sqrt_Of_No(625));
//		cube root of a number
		System.out.println("Cube root of a number " + q1.cubeRoot_Of_No(125));
//		Remove whitespace from a string
		System.out.println(q1.removewhiteSpace("devendra kumar pal"));
		Question.aiseHi();
		
		System.out.println("\t\t\t\t\t\tThis message was deleted");
		
		 
	}
}
