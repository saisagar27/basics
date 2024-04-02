package com.ty.inheritance;

public class Parent {
	
	int i;
	Parent(){
		
	}
	Parent(int i){
		this.i=i;
		System.out.println("Inside Parent Parameter Constructor");
	}
	
	void add() {
		System.out.println("Inside Parent Method");
	}

}
