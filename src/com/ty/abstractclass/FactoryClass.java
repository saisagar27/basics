package com.ty.abstractclass;

public class FactoryClass {
	
	public void fMethod(Shape s) {
		s.takeInput();
		s.compute();
		s.display();
	}

}
