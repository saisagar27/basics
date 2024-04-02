package com.ty.exception;
import java.lang.*;

public class Demo {
	public static void main(String[] args) {
		System.out.println(1);
		try {
		System.out.println(1/0);
		}
		catch(Exception e) {
			System.out.println("hi");
		}
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
	}

}
