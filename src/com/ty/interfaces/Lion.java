package com.ty.interfaces;

import java.util.Scanner;

public class Lion implements Animal {
	int price;

	@Override
	public void sound() {
		System.out.println("Lion roars");
		
	}

	@Override
	public void weight() {
		Scanner sc=new Scanner(System.in);
		price=sc.nextInt();
		System.out.println(price+" is the weight of the Lion");
	}

}
