package com.collection;
import java.util.*;

public class PriorityQueueImp {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.add(15);
		pq.add(105);
		pq.add(150);
		pq.add(1500);
		pq.add(115);
		System.out.println("The Pq elements are :" + pq);
		System.out.println("The topmost element of pq is : "+ pq.peek());
		System.out.println("The Pq elements are :" + pq);
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(15);
		arr.add(150);
		arr.add(1500);
		if(pq.containsAll(arr)) {
			System.out.println("Sab ke sab mere yaha hi bhar diye hai");
		}
		else {
			System.out.println("Mere yahan koi nahi hai yrr");
		}
		pq.remove();
		System.out.println("The Pq elements are :" + pq);
		pq.add(1500);
		pq.removeAll(arr);
		System.out.println("The Pq elements are :" + pq);
		pq.remove();
		pq.remove(105);
		System.out.println("The Pq elements are :" + pq);
		pq.add(900);
		pq.offer(87);
		pq.offer(548);
		pq.offer(5480);
		pq.offer(15480);
		System.out.println("The Pq elements are :" + pq);
		pq.forEach(i->{
			System.err.print(i+" ");
		});
		System.out.println();
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.err.print(it.next()+" ");
		}
		System.out.println("PriorityQueueImp.main()");
		System.err.println(pq.size());
		System.err.println(pq.isEmpty());
		
		PriorityQueue<Integer> pqq = new PriorityQueue<>(arr);
		pqq.forEach(ac->{
			System.err.print(ac+" ");
		});
		
		System.out.println(pqq.offer(995));
		
	}
}
