package com.overloading;

import java.util.Scanner;

public class Bank {
	float RateOfIntrest;
	
	float getRateOfIntrest() {
		return RateOfIntrest;
	}
}

class SBI extends Bank{
	float RateOfIntrest=8;
	float getRateOfInterest() {
		return RateOfIntrest;
	}
}
class PNB extends Bank{
	float RateOfIntrest=9;
	float getRateOfInterest() {
		return RateOfIntrest;
	}
}

class AXIS extends Bank{
	float RateOfIntrest=11;
	float getRateOfInterest() {
		return RateOfIntrest;
	}
}

class Implement{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for SBI");
		System.out.println("Press 2 for PNB");
		System.out.println("Press 3 for AXIS");
		System.out.println("Select Your Bank");
		
		int bank = sc.nextInt();
		switch(bank) {
		
		case 1:
			SBI s = new SBI();
			System.out.println("You have choose SBI");
			System.out.println("RateOfIntrest of The SBI is : " + s.getRateOfInterest());
			break;
			
		case 2:			
			PNB p = new PNB();
			System.out.println("You have choose PNB");
			System.out.println("RateOfIntrest of The PNB is : " + p.getRateOfInterest());
			break;
		
		case 3:
			AXIS a = new AXIS();
			System.out.println("You have choose AXIS");
			System.out.println("RateOfIntrest of The AXIS is : " + a.getRateOfInterest());
			break;
			
		 default:
			 System.out.println("Please Enter your Bank");
			 break;
		
		}
		
		
	}
}