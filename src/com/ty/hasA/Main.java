package com.ty.hasA;

public class Main {
	public static void main(String[] args) {
		
	
	Mobile m=new Mobile();
	

	
	System.out.println(m.os.name);
	System.out.println(m.os.version);
	
	Charger c=new Charger("Redmi",5);
	m.hasA(c);
	
	
	}
	
}