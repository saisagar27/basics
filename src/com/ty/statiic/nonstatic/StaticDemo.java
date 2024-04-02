package com.ty.statiic.nonstatic;

public class StaticDemo {
	
	static String name;
	int id;
	int salary;
	
	static {
	name="sagar";
	System.out.println("Inside Static Block");
	}
	
	void log() {
		System.out.println("Logged in");
	}

	public static void main(String[] args) {
		System.out.println("Insidde Main");
		
		StaticDemo s1=new StaticDemo();
		System.out.println(s1.id=10);
		System.out.println(s1.salary=500);
		System.out.println(StaticDemo.name);
		s1.log();
		
		StaticDemo s2=new StaticDemo();
		System.out.println(s1.id=20);
		System.out.println(s1.salary=2500);
		System.out.println(s2.name="rahul");
		s1.log();
		

	}

}
