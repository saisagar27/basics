package com.ty.pgms;

public class LeapYear {
	public static void main(String[] args) {
		int year=2020;
		if(year%400==0 || (year%4==0 && year%100!=0))
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+" Not a Leap Year");
		
	}

}
