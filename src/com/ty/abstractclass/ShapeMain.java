package com.ty.abstractclass;

public class ShapeMain {
	public static void main(String[] args) {
		Square s=new Square();
		Rectangle r=new Rectangle();
		Circle c=new Circle();
//		
//		s.takeInput();
//		s.compute();
//		s.display();
//		
//		r.takeInput();
//		r.compute();
//		r.display();
//		
//		
//		c.takeInput();
//		c.compute();
//		c.display();
		
		FactoryClass f=new FactoryClass();
		f.fMethod(s);
		f.fMethod(r);
		f.fMethod(c);
		
	}

}
