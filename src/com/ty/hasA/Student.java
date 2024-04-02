package com.ty.hasA;

public class Student {
	
	Heart h=new Heart(80,5);
	
	Brain b=new Brain(5,20);
	
	
	public void hasBook(Book b) {
		System.out.println(b.getAuthor());
		System.out.println(b.getPrice());
	}
	public void hasBike(Bike b) {
		System.out.println(b.getName());
		System.out.println(b.getPrice());
	}

}
