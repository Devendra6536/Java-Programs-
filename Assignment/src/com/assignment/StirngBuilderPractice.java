package com.assignment;

public class StirngBuilderPractice {
	 public static String concatWithString()    {  
	        String t = "Java";  
	        for (int i=0; i<10000; i++){  
	            t = t + "Tpoint";  
	        }  
	        return t;  
	    }  
	    public static String concatWithStringBuffer(){  
	        StringBuffer sb = new StringBuffer("Java");  
	        for (int i=0; i<10000; i++){  
	            sb.append("Tpoint");  
	        }  
	        return sb.toString();  
	    }  
	    
//	    concatenate with sstringBuuilder class
	    public static String concatWithStringBuilder(){  
	        StringBuilder sb = new StringBuilder("Java");  
	        for (int i=0; i<10000; i++){  
	            sb.append("Tpoint");  
	        }  
	        return sb.toString();  
	    }  
	    
	public static void main(String[] args) {
		
		StringBuilder s  = new StringBuilder();
		s.append("pal");
		s.append("pal");
		s.append("pal");
		s.append("pal");
		System.out.println(s);
		
		 long startTime = System.currentTimeMillis();  
	        concatWithString();  
	        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
	        startTime = System.currentTimeMillis();  
	        concatWithStringBuffer();  
	        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  
	        concatWithStringBuilder();
	        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  
	        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()));  
		
	        
	}
}
