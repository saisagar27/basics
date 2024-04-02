package com.ty.nonstatic;

public class Nonstatic {
	int a=10;
	int b=20;
	
	public Nonstatic() {
		System.out.println("Construcutor ");
	}
	{
		System.out.println(a+b);
	}

}
