package com.ty.lambda;

public class ImplofA  {
	public static void main(String[] args) {
		
		A a=(i,j)->{int x=i+j;
			System.out.println(x);
			};
		
		a.add(5, 10);
		
		System.out.println(-6%5);
	}


}
