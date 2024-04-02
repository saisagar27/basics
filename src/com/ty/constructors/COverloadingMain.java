package com.ty.constructors;

public class COverloadingMain {
	public static void main(String[] args) {
	COverloading c=new COverloading();

	COverloading c1=new COverloading(1,5);
	System.out.println(c1.getId());
	System.out.println(c1.getNo());
		
	COverloading c2=new COverloading(1,"sai",50);
	System.out.println(c2.getId());
	System.out.println(c2.getNo());
	System.out.println(c2.getName());
		
		
	}

}
