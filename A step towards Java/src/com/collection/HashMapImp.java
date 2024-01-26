package com.collection;
import java.util.*;
import java.util.HashMap;
public class HashMapImp {
	
	public static void main(String[] args) {
//		HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
		HashMap<Character,Integer> mp  = new LinkedHashMap<>();
		mp.put('a', 1);
		mp.put('b', 10);
		mp.put('c', 111);
		mp.put('d', 110);
		mp.put('e', 114);
		
		System.out.println(mp.size());
//		mp.clear();
		System.out.println(mp.size());
		System.out.println(mp);
		
		Integer a = mp.get('d');
		System.out.println("The value of the d's key is : "+ a);
		mp.put(null,58);
		mp.put('t',null);
		System.out.println(mp.get(null));
		System.out.println(mp.get('t'));
		
		
		HashMap<Integer,String> mpp = new HashMap<Integer,String>(5);
		mpp.put(1,"One");
		mpp.put(2,"Two");
		mpp.put(3,"Three");
		mpp.put(4,"four");
		mpp.put(5,"Five");
		mpp.put(6,"Six"
				+ "");
		System.out.println(mpp);
	}
}
