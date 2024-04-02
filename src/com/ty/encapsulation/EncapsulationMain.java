package com.ty.encapsulation;

public class EncapsulationMain {
	public static void main(String[] args) {
		Encaplusation e=new Encaplusation();
		
		e.setId(10);
		e.setJob("Engineer");
		e.setName("Sagar");
		e.setSalary(5000);
		
		
		System.out.println(e.getId());
		System.out.println(e.getJob());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}

}
