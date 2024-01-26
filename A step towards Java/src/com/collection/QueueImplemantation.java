package com.collection;

import java.util.*;
import java.util.LinkedList;

public class QueueImplemantation {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
//		ye kya karta hai ki add karega to kuchh nahi but
//		agar add nahi hua to exception throws karta hai
		q.add(25);
		q.add(250);
		q.add(2500);
		q.add(25000);
		q.add(250000);
		System.out.println(q);
		
//		ye true false return karta hai
		q.offer(2514);
		System.out.println(q);
		
//		ye kya karta hai ki element remove karta hai starting se but
//		agar queue empty hai to exception throws karta hai
		System.out.println(q.isEmpty());
		System.out.println(q.element());
		System.out.println(q.peek());
		q.remove();
		System.out.println(q);
		
//		Ye true false return akrta hai
		q.poll();
		System.out.println(q);
		
	
		Iterator<Integer> it = q.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		q.forEach(i->{
			System.out.print(i+" ");
		});
		System.out.println();
		if(q.contains(2500)) System.out.println("Yes present");
		else System.out.println("Not! present");
		System.out.println("\n");
		System.out.println("\t Implemantation using Priority queue");
		Queue<Character> qq = new PriorityQueue<>();
		qq.add('c');
		qq.add('a');
		qq.add('b');
		qq.add('d');
		qq.add('e');
		System.out.println(qq);
		System.out.println(qq.offer('u'));
		System.out.println(qq);
		qq.offer('8');
		System.out.println(qq);
		Queue<Integer> qqq = new PriorityQueue<>(Collections.reverseOrder());
		qqq.add(10);
		qqq.add(110);
		qqq.add(140);
		qqq.add(9);
		qqq.add(910);
		System.out.println(qqq);
		qqq.remove();
		qqq.remove();
		qqq.remove();
		qqq.remove();
		qqq.poll();
		qqq.poll();
		System.out.println(qqq.poll());
		System.out.println(q.size());
		qqq.offer(58);
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(52);
		arr.add(520);
		arr.add(5200);
		arr.add(52000);
		qqq.addAll(arr);
		if(qqq.isEmpty()) System.out.println("Khali hai yrr");
		else System.out.println("Khali nahi hai");
		System.out.println(qqq);
		
	}
}
