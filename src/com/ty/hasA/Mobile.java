package com.ty.hasA;

public class Mobile {
	
	OperatingSystem os=new OperatingSystem("linux",5);
	
	public void hasA(Charger c)
	{
		System.out.println(c.getBrand());
		System.out.println(c.getVolt());
	}
	

}
