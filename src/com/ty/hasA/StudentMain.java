package com.ty.hasA;

public class StudentMain {
	public static void main(String[] args) {
		Student s=new Student();
		
		System.out.println(s.h.heartbeat);
		System.out.println(s.h.weight);
		
		
		System.out.println(s.b.weight);
		System.out.println(s.b.width);
		
		
		Book b1=new Book("John",5000);
		Bike b2=new Bike(10000,"R15");
		
		
		s.hasBike(b2);
		s.hasBook(b1);
		
		s=null;
		s.hasBike(b2);
	
		
		
		
		
	}

}
