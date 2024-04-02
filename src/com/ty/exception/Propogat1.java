package com.ty.exception;

public class Propogat1 {
	public static void main(String[] args)  {
		Propogate2 p=new Propogate2();
		try{
			p.m1();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("Hiii");
		}
		System.out.println("Byee");
	}

}
