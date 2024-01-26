package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeImp {
	public static void main(String[] args) {
		
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
//		Add method in the deque
		System.out.println("Add method in the deque");
		
		dq.add(45);
		dq.add(50);
		System.out.println(dq);
		dq.addFirst(124);
		System.out.println(dq);
		dq.addLast(234);
		System.out.println(dq);
		
		dq.offer(250);
		System.out.println(dq);
		dq.offerFirst(87);
		System.out.println(dq);
		dq.offerLast(98);
		System.out.println(dq);
		
		
//		Accessing Deque Element 
		System.out.println(dq.getFirst());
		System.out.println(dq);
		System.out.println(dq.getLast());
		System.out.println(dq);
		
		System.out.println(dq.peek());
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		System.out.println(dq);
		
		ArrayDeque<Integer> dqq = new ArrayDeque<Integer>();
//		Removing Element From the Deque
		System.out.println(dq.remove());
		System.out.println(dq.remove(234));
		System.out.println(dq.removeFirst());
		System.out.println(dq.removeLast());
		System.out.println(dq);
//		System.out.println(dqq.remove());
		
		System.out.println(dq.poll());
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq.pollLast());
		dq.add(784580);
		System.out.println(dq);
		
		dq.clear();
		System.out.println(dq);
		dq.add(10);
		dq.add(11);
		dq.add(12);
		dq.add(13);
		dq.add(14);
		dq.add(15);
		
		Iterator<Integer> it = dq.iterator();
		while(it.hasNext()) System.out.print(it.next()+" ");
		it = dq.descendingIterator();
		System.out.println();
		while(it.hasNext()) System.out.print(it.next()+" ");
		
		dq.forEach(i->{
			System.out.print(i+" ");
		});
		System.out.println();
		if(dq.contains(15)) System.out.println("Are bhai Manish tera bag hai kahe pareshan ho ra hai");
		else System.out.println("Manish tera bag nahi hai");		
		System.out.println(dq.size());
		System.out.println(dq.element());
		System.out.println(dq);
		
		Object[] arr = dq.toArray();
		int sum=0;
		for(Object ob:arr) {
			sum+=(Integer)ob;
			System.out.print(ob+" ");
		}
		System.out.println(sum);
		
		
		int[] brr = new int[] {1,2,3,4,5};
		for(int i=0;i<brr.length;i++) {
			System.out.print(brr[i]+" ");
		}
		System.out.println();
		
		int [] crr=new int [4];
		crr[0]=10;
		crr[1]=10;
		crr[2]=10;
		crr[3]=10;
		for(int i=0;i<crr.length;i++) {
			System.out.print(crr[i]+" ");
		}
		System.out.println(crr);
		
		
		
	}
	
	
}
