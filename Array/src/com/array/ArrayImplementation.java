package com.array;

import java.util.Scanner;

public class ArrayImplementation {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number in the array");
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Entered number of the array");
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();

		for(int s:arr) {
		  System.out.println(s);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		int[] brr = {1,3,2,3,4,5,6,4};
		for(int x:brr) {
			System.out.print(x+" ");
		}
		
		String[] name = {"Devendra pal","Puneet Pal", "Abdhesh Pal"," yash Dayal"};
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+" ");
			
		}
		System.out.println("bye");
		
		
		int[] crr = new int[5];
		int[][] frr = new int[2][3];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				frr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(frr[i][j]+" ");
			}
			System.out.println();
		}		
		
	}
}
