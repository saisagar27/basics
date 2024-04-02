package com.ty.pgms;

import java.util.Scanner;

public class Compare2Numb {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		if(num1>num2)
			System.out.println("Num1 is greater than Num2");
		else if(num2>num1)
			System.out.println("Num2 is greatrer than Num1");
		else
			System.out.println("Both are Equal");
		
	}

}
