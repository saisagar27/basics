package com.ty.pgms;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1="Silent";
		String s2="Listen";
		
		anagram(s1,s2);
		
		if(anagram(s1,s2)) {
			System.out.println("Given String is a Anagram");
		}
		else {
			System.out.println("Not a Anagram");
	}
		
	}
	public static boolean anagram(String s1, String s2) {
		String s=s1.toLowerCase();
		String ss=s2.toLowerCase();
		
		char[] ch=s.toCharArray();
		char[] ch1=ss.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		return Arrays.equals(ch, ch1)?true:false;
		
	}

}
