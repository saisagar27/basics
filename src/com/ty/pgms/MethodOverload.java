package com.ty.pgms;

public class MethodOverload {
	
	void add(long l,byte b)
	{
		System.out.println(l+b);
	}
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(double a,String s ) {
		System.out.println(a+s);
	}
	void sub(double a,float f) {
		System.out.println(a-f);
	}
	void sub(double a,int x) {
		System.out.println(a-x);
	}

}
