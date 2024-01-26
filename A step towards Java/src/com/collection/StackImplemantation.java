package com.collection;
import java.util.*;
import java.util.LinkedList;

public class StackImplemantation {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(25);
		st.push(250);
		st.push(2500);
		st.push(25000);
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.size());
		System.out.println(st.search(25));
		st.push(250000);
		st.push(250);
		Iterator it = st.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		st.forEach(i->{
			System.out.print(i+" ");
		});
	}
}

/*
package com.collection;

public class Stack {
	public
		int[] arr;
		int top;
		int capacity;
		Stack(int size){
			arr = new int[size];
			capacity = size;
			top =-1;
		}
		
		public void add(int x) {
			if(isFull()) System.out.println("The Stack is full");
			else arr[++top]=x;
		}
		public int pop() {
			if(isEmpty()) {
				System.out.print("The stack is empty ");
				return -1;
			}
			return arr[top--];
		}
		public void printStack() {
			if(isEmpty()) System.out.println("The Stack is Empty");
			for(int i=0;i<=top;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		public boolean isFull() {
			return top==capacity-1;
		}
		public boolean isEmpty() {
			return top==-1;
		}
		public static void main(String[] args) {
			Stack st = new Stack(5);
			st.add(5);
			st.add(25);
			st.add(125);
			st.add(625);
			st.printStack();
			System.out.println(st.pop());
			System.out.println(st.pop());
			System.out.println(st.pop());
			System.out.println(st.pop());
			System.out.println(st.pop());
			st.printStack();
			
			System.out.println("The Stack using Predefind clss of collection ");
			
		}


}

*/