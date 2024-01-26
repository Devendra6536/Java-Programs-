package com.exceptionpratice;

public class ExcepPractice {
	
	public static void main(String[] args) {
		
//		Nested try - catch block
		try {
						
//			ArithmeticException 1t inner block
					try {
						
						int a=50/0;		
						System.err.println(a);
						}
					catch(ArithmeticException e) {
						e.printStackTrace();
//						System.out.println(e);
						}
					
						
//		ArrayIndexOutOfBoundsException inner try and catch block
		
					try {
							int a[] = new int[5];
							System.out.println(a[10]);
						}
						catch(ArrayIndexOutOfBoundsException e) {
							e.printStackTrace();
//							System.out.println(e);
						}
					}
		catch(Exception e) {
			e.printStackTrace();
		}
	
}
}

