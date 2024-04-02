package com.ty.inheritance;

public class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Plane is flying at medium height");
	}
	void seats() {
		System.out.println("No passengers seat are present");
	}

}
