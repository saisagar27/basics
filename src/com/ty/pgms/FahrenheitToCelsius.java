package com.ty.pgms;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double d1=sc.nextDouble();
		double d2=(d1*9/5)+32;
		
		System.out.println(d2);
		
		double d3=sc.nextDouble();
		double d4=(d3-32)*5/9;
		System.out.println(d4);
		
	}

}
