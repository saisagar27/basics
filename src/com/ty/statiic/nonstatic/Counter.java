package com.ty.statiic.nonstatic;

public class Counter {
	static int count=0;
//	public Counter() 
	{
		count++;
	}
	
	public static void main(String[] args) {
		Counter c=new Counter();
		System.out.println(c.count);
		Counter c1=new Counter();
		System.out.println(c1.count);
	}

}
