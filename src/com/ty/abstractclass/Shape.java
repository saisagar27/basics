package com.ty.abstractclass;

public abstract class Shape {
	
	double area;
	
	abstract void takeInput();
	abstract void compute();
	
	public void display() {
		System.out.println("The area is "+area);
	}

}
