package max;

import java.util.Random;
import java.util.Scanner;
public class GenAadhar {
	final String aadhaar;
	
	GenAadhar() {
		aadhaar=createAdhar();
	}
	
	public GenAadhar generateAdhar(int age) {
		if(age>17 && age<=60) {
			return new GenAadhar();
		}
		return null;
	}
	
	private String createAdhar() {
		StringBuffer  sb = new StringBuffer();
		for(int i=0;i<10;i++) {
		sb.append(new Random().nextInt(10));		
		}
		return sb.toString().substring(0, 5)+"XXXXX"+sb.toString().substring(8);
	}
	/*private String createAdhar() {
		StringBuilder  sb = new StringBuilder();
		for(int i=0;i<10;i++) {
		sb.append(new Random().nextInt(10));		
		}
	
		return sb.toString().substring(0, 5)+"XXXXX"+sb.toString().substring(8);
	}*/
	
	
	public String toString()
	{
		return aadhaar;
	}

	
	/*public static void main(String[] args) {
		GenAadhar a = new GenAadhar();		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		long startTime = System.currentTimeMillis(); 
		a.genAdhar(age);
		System.out.println("your Aadhaar number is " + a.aadhaar);
		System.out.println("Time take to genrate the Aadhaar: "+(System.currentTimeMillis()-startTime)+"ms");  
		
	}*/
}


