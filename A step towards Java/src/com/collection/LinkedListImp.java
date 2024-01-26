package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListImp {	
	ListNode head;
	static class ListNode{
		public
			int data;
			ListNode next;
			ListNode(int data){this.data=data;next=null;}
	}
	public static LinkedListImp insert(LinkedListImp list,int data) {
		ListNode node = new ListNode(data);
		
		if(list.head==null) {
			list.head = node;
		}
		else {
			
			while(list.head.next!=null) {
				list.head = list.head.next;
			}
			list.head.next = node;				
		}
		return list;
		
	}
	public static void printListNode(LinkedListImp list) {
		System.out.print("The Linked list is : ");
		while(list.head != null) {
			System.out.print(list.head.data+" ");
			list.head = list.head.next;
		}
	}
			
		public static void main(String[] args) {
				
				
				
				
			LinkedListImp list = new LinkedListImp();
				list =  insert(list, 4);
				list =  insert(list, 5);
				list =  insert(list, 6);
				list =  insert(list, 7);
				list =  insert(list, 7);
				list =  insert(list, 7);
				list =  insert(list, 8);
				list =  insert(list, 8);
				list =  insert(list, 8);
				list =  insert(list, 8);
				printListNode(list);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
			
	
	
		
		
		/*LinkedList<Integer> list = new LinkedList<>();
		list.add(25);
		list.add(250);
		list.add(2500);
		list.add(25000);
		System.out.println(list);
		list.add(1,25);
		System.out.println(list);
		
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(78);
		a.add(87);
		a.add(47);
		a.add(77);
		list.addAll(a);
		System.out.println(list);
		list.addFirst(45);
		System.out.println(list);
		list.addLast(105);
		System.out.println(list);
		
		if(list.contains(45)) {
			System.out.println("This number is present in the list");
		}
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		list.forEach(i->{
			System.out.print(i+" ");
		});
		System.out.println();
		Iterator<Integer> ii = list.descendingIterator();
		while(ii.hasNext()) {
			System.out.print(ii.next()+" ");
		}
		System.out.println();
		
		
		
		System.out.println(list.element());
		
		list.offer(84);
		System.out.println(list);
		list.offerLast(4005);
		System.out.println(list);
		}*/
		
		}
}
