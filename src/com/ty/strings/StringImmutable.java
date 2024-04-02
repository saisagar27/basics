package com.ty.strings;

public class StringImmutable {
	public static void main(String[] args) {
		String s1=new String("sagar");
		String s2=new String("sagar");
		String s3=s1.concat(" elevate");
		String s4="sagar elevate";
		
		if(s1.equals(s2)) {
			System.out.println("Both are Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
		if(s3.equals(s4)) {
			System.out.println("Equal");
		}
	}

}
