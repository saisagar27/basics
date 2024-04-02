package com.ty.inheritance;

public class Person2 extends Person{
	int i=20;
	@Override
	void name() {
		System.out.println("Person2 name is ram");
		System.out.println(i);
		System.out.println(super.i);
	}
	
	void exp() {
		System.out.println("PErson2 has 10 years exp");
	}

}
