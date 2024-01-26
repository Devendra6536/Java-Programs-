package com.assignment;

public class StringBufferPractice {

	
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer();
		StringBuffer s1 = new StringBuffer("Devendra");
		System.out.println(s);
		System.out.println(s1);
		
		
//		append() method
		StringBuffer s2 = new StringBuffer("Dk");
		s2.append(" pal");
		System.out.println(s2);
		s2.append(8);
		System.out.println(s2);
		char a = 'a';
		s2.append(a);
		System.out.println(s2);
		s2.append(25.5);
		System.out.println(s2);
		
//		insert method
		StringBuffer s3 = new StringBuffer("Devendra ");
		s3.insert(1, "D"); 
		s3.insert(0, false); 
		System.out.println(s3);
		
//		replace method
		StringBuffer s4 = new StringBuffer("DevendraKumarPal ");
		s4.replace(1, 5, "e");
		System.out.println(s4);
//		delete method
		StringBuffer s5 = new StringBuffer("laPramuKardneved");
		s5.delete(0, 5);
		System.out.println(s5);
//		reverse mthod
		System.out.println(s5.reverse());
		StringBuffer s6 = new StringBuffer("laPramuKardneved");
//		capacity method
		System.out.println(s6.capacity());
		s6.ensureCapacity(50);
		System.out.println(s6.capacity());
//		length() method
		System.out.println(s6.length());
//		ensure capacitty method

		
		
		
		System.out.println("this is the homework");
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("one");
		System.out.println("->"+sb.capacity());
		StringBuffer sb1 = new StringBuffer("abc");
		System.out.println(sb1.capacity());
		System.out.println(sb1.reverse());
		String m="india";
		StringBuffer sb2 = new StringBuffer(m);
		System.out.println(sb2.reverse());
		
	}
}
