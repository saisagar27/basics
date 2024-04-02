package com.ty.inheritance;

import javax.swing.PopupFactory;

public class PlaneMain {
	public static void main(String[] args) {
		/*Plane p=new Plane();
		p.takeOff();
		p.fly();
		p.land();
		
		PassengerPlane p1=new PassengerPlane();
		p1.takeOff();
		p1.fly();
		p1.land();
		
		FighterPlane p2=new FighterPlane();
		p2.takeOff();
		p2.fly();
		p2.land();*/
		
		Plane p=new FighterPlane();
		p.takeOff();
		p.land();
		p.fly();
		 
		FighterPlane f=(FighterPlane) p;
		f.seats();
		
		Plane pp=new PassengerPlane();
		pp.takeOff();
		pp.land();
		pp.fly();
		
		PassengerPlane pl=(PassengerPlane) pp;
		pl.seats();
		
		
	}

}
