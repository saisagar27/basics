package com.ty.strings;

public class StringMutable {
	public static void main(String[] args) {
		String s1="sagar";
		String s2="sai";
		String s3=new String(s1);
		
		if(s3.equals(s3)) {
			System.out.println("Eqqual");
			
			
			String x="xyz";
			x.toUpperCase();
			String y=x.replace('Y','y');
			y=y+"abc";
			System.out.println(y);
		}
		
	}

}
