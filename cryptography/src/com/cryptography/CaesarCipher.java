package com.cryptography;

public class CaesarCipher {
	public String encrypt(String input,int key) {
		StringBuilder sb = new StringBuilder(input);
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String ShiftedElement  = alphabet.substring(key)+ alphabet.substring(0,key);
		
		for(int i=0;i<sb.length();i++) {
			char currChar = sb.charAt(i);
			int index = alphabet.indexOf(currChar);
			
			if(index!=-1) {
				char newChar =ShiftedElement.charAt(index);
				sb.setCharAt(index, newChar);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		
		int key = 15;
		CaesarCipher c = new CaesarCipher();
        
        String message = "A BAT DEVENDRA KUMAR PAL GARHIKHANPUR BUDAUN ";
        String encrypted = c.encrypt(message,key);
        System.out.println("Key is"+ key+"\n"+encrypted);
	}
}
