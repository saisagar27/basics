package com.ty.abstractclass;

import java.util.Scanner;

public class Square extends Shape{
		double len;
		double wid;
		@Override
		void takeInput() {
			Scanner sc=new Scanner(System.in);
			len=sc.nextDouble();
			wid=sc.nextDouble();
			
		}
		@Override
		void compute() {
			area=len*wid;
			
		}
		
}
