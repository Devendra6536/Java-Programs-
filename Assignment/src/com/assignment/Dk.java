package com.assignment;

import java.util.Scanner;

public class Dk {
	public class DK {
	    public static void main(String[] args) {
	        vehicle sourabh = new vehicle();

	        System.out.println("What do u want to know about Sourabh vehicle");
	        System.out.println("Press Number");
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Number");
	        System.out.println("Press 1 for Basicdetails :");
	        System.out.println("Press 2 for fuelRequired :");
	        System.out.println("Press 3 for Manufacture :");
	        try{
	        int operation = sc.nextInt();
	        switch (operation){
	            case 1:
	                sourabh.Basicdetails();
	                break;
	            case 2: 
	                System.out.println(sourabh.fuelRequired());
	                break;
	            case 3:
	                System.out.println(sourabh.manufacture());
	        }
	        }
	        catch (Exception e){
	            System.out.println("Please Enter the correct number");
	        }

	    }
	}

}
