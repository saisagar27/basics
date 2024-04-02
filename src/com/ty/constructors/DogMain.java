package com.ty.constructors;

public class DogMain {
	public static void main(String[] args) {
		Dog d=new Dog(1,"tim","lab");
		System.out.println(d.getId());
		System.out.println(d.getName());
		System.out.println(d.getBreed());
		
		
		Dog d1=new Dog(2,"jim","pug");
		System.out.println(d1.getId());
		System.out.println(d1.getName());
		System.out.println(d1.getBreed());
		
	}

}
