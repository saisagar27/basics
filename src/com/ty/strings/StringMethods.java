package com.ty.strings;

public class StringMethods {
	public static void main(String[] args) {
		String s="Hi im sai sagar";
		
		System.out.println(s.contains(" "));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(1, 11));
		System.out.println(s.endsWith("r"));
		System.out.println(s.startsWith("h"));
		System.out.println(s);
		System.out.println(s.concat(" Bye"));
		
	}

}
