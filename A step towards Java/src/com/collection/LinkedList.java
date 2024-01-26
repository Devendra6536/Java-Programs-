package com.collection;

import java.util.Scanner;

public class LinkedList {
	ListNode head;
	static class ListNode{
		int data;
		ListNode next;
		ListNode(int d){
			data = d;
			next=null;
		}
	}
	
	public static LinkedList insert(LinkedList list,int data) {
		ListNode newNode = new ListNode(data);
		if(list.head==null) {
			list.head = newNode;
		}
		else {
			ListNode last = list.head;
			while(last.next!=null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}
	public static LinkedList insertAtBeg(LinkedList list,int data) {
		ListNode newNode = new ListNode(data);
		if(list.head==null) {
			list.head = newNode;
			return list;
		}
		else {
			LinkedList temp = list;
			newNode.next = temp.head;
			list.head = newNode;
		}
		return list;
	}
	public static void PrintList(LinkedList list) {
		if(list.head==null) System.out.println("The List Is Empty");
		System.out.print("The Linked List element are : ");
		ListNode currNode = list.head;
		while(currNode!=null) {
			System.out.print(currNode.data+" ");
			currNode = currNode.next;			
		}
		System.out.println();
	}
	public static void deleteNode(LinkedList list) {
		if(list.head==null) {
			System.out.println("The List Is Empty");
		}
		else {
			list.head = list.head.next;
		}
		
	}
	public static void deleteFromEnd(LinkedList list) {
		
		ListNode l = list.head;
		if(l==null) System.out.println("The Linked List Is Empty");
		if(l.next==null) {
			list.head = list.head.next;
			return;
		}
		while(l.next.next != null) {
			l = l.next;
		}
		l.next = null;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		/*list = insert(list,10);
		list = insert(list,100);
		list = insert(list,1000);
		list = insert(list,10000);
		list = insertAtBeg(list,14);*/
		
		System.out.println("\t\t\tPress 0 for quiting ");
		System.out.println("\t\t\tPress 1 for inserting an element at the end");
		System.out.println("\t\t\tPress 2 for inserting an element at the head");
		System.out.println("\t\t\tPress 3 for printing the list");
		System.out.println("\t\t\tPress 4 for deleting the node form the end of the list");
		Scanner sc = new Scanner(System.in);
		int choice,val;		
		while(true) {
			System.out.println("Enter the choice ");
			choice = sc.nextInt();
				switch (choice) {
				case 1: {		
					System.out.println(" Enter the value for inserting");
					val = sc.nextInt();
					list = insert(list,val);
					break;
				}
				case 2:{
					System.out.println(" Enter the value for inserting");
					val = sc.nextInt();
					list = insertAtBeg(list,val);
					break;
				}
				case 3:{
					PrintList(list);
					break;
				}
				case 4:{
					deleteNode(list);
					break;
				}
				case 5:{
					deleteFromEnd(list);
					break;
				}
				default:
					System.out.println("You entered wrong input");
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}
				if(choice==0) break;
		}
		PrintList(list);
		
	}
}
