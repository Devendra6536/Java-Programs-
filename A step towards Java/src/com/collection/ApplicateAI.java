package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ApplicateAI {
	public void search(int Pid,ArrayList<ArrayList<Integer>>a) {
		ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<6;i++) {
			ArrayList<Integer> brr = new ArrayList<>();
				if(a.get(i).get(1)==Pid) {
					brr.add(a.get(i).get(1));
					brr.add(a.get(i).get(0));
					b.add(brr);					
				}				
			}
		for(int i=0;i<b.size();i++) {
			System.out.println(b.get(i).get(1)+" "+ b.get(i).get(0));
		}
		}
	
	public void report(ArrayList<ArrayList<Integer>>a) {
		ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<6;i++) {
			ArrayList<Integer> brr = new ArrayList<>();
			
		}
	
		
	}
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		Scanner sc = new Scanner(System.in);
		for(int j=0;j<6;j++) {
			ArrayList<Integer> newList = new ArrayList<>();
			System.out.println("Enter 3 Number ");
				for(int i=0;i<3;i++) {
					newList.add(sc.nextInt());
				}
		 a.add(newList);
		}
		
		
		
		System.out.println();
		System.out.println(a.get(0).get(0));
		for(int i=0;i<6;i++) {
			for(int j=0;j<3;j++) {
			System.out.print(a.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		ApplicateAI ai = new ApplicateAI();
		ai.search(2, a);
		
		
		System.out.println();
		int i;
		for(i=0;i<6;i++) {
		Collections.sort(a, new Comparator<ArrayList<Integer>>(){
	        @Override
	        public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2){
	            return o1.get(i).compareTo(o2.get(i));
	        }
	    });
		}
		
		
		
		System.out.println();
		System.out.println(a.get(0).get(0));
		for(i=0;i<6;i++) {
			for(int j=0;j<3;j++) {
			System.out.print(a.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}

}
