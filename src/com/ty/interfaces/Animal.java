package com.ty.interfaces;

public interface Animal {
	
	void sound();
	void weight();
	
	default void details() {
		System.out.println("All are Animals");
	}

}
