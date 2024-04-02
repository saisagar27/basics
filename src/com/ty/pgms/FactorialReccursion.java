package com.ty.pgms;

public class FactorialReccursion {
	public static void main(String[] args) {
		int value=fact(6);
		System.out.println(value);
		
	}
	static int fact(int x) {
		if(x==1)
			return 1;
		else {
			return x*fact(x-1);
		}
	}

}
