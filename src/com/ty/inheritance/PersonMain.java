package com.ty.inheritance;

public class PersonMain {
	public static void main(String[] args) {
		Person p=new Person();
		p.name();
		p.cname();
		p.id();
		
		Person p1=new Person1();
		p1.name();
		p1.cname();
		p1.id();
		((Person1) p1).salary();
		
		Person p2=new Person2();
		p2.name();
		p2.cname();
		p2.id();
		((Person2) p2).exp();
		
	}

}
