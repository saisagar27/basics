package com.ty.pgms;

public class FibonnaciReccursion {
	static int n1=0,n2=1,n3=0;
	public static void main(String[] args) {
		int count=5;
	System.out.print(n1+" "+n2);
	fibo(count-2);
	}
	static void fibo(int count) {
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fibo(count-1);
			
		}
	}
}
