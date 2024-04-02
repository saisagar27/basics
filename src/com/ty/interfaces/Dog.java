package com.ty.interfaces;

import java.util.Scanner;

public class Dog implements Animal{
	int price;

	@Override
	public void sound() {
		System.out.println("Dog barks");
		
	}

	@Override
	public void weight() {
		Scanner sc=new Scanner(System.in);
		price=sc.nextInt();
		System.out.println(price+" is the weight of the dog");
	}

}
