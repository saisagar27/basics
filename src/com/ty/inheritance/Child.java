package com.ty.inheritance;

public class Child extends Parent{
	int j;
	Child(){
		
	}
	
	Child(int j){
		super(j);
		this.j=j;
		System.out.println("Child Parameter Constructor");
	}
	void sub() {
		System.out.println("Inside Child Method");
	}

}
