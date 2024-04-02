package com.ty.interfaces;

public class AnimalMain {
	public static void main(String[] args) {
		Dog d=new Dog();
		Cat c=new Cat();
		Lion l=new Lion();		
		Selection s=new Selection();
		s.select(l);
		s.select(d);
		s.select(c);
		
		
		
	}
	
	
	

}
