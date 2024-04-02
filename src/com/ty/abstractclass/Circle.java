package com.ty.abstractclass;

import java.util.Scanner;

public class Circle extends Shape{
	double r;
	@Override
	void takeInput() {
		Scanner sc=new Scanner(System.in);
		r=sc.nextDouble();
		
	}
	@Override
	void compute() {
		area=3.14*r*r;
		
	}

}
