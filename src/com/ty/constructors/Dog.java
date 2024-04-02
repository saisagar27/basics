package com.ty.constructors;

public class Dog {
	private int id;
	private String name;
	private String breed;
	
	public Dog(int id,String name,String breed) {
		this.id=id;
		this.name=name;
		this.breed=breed;
	}

	public int getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	
	public String getBreed() {
		return breed;
	}

	
}
