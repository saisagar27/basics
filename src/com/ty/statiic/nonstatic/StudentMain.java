package com.ty.statiic.nonstatic;


public class StudentMain {
	public static void main(String[] args) {
		System.out.println("Inside Main");
		
		Student s1=new Student();
		System.out.println("Inside Object");
		System.out.println(s1.id=1);
		System.out.println(s1.marks=100);
		System.out.println(s1.name="sagar");
		System.out.println(s1.school);
		
		Student s2=new Student();
		System.out.println(s2.id=2);
		System.out.println(s2.marks=90);
		System.out.println(s2.name="sai");
		System.out.println(s2.school);
		
		Student s3=new Student();
		System.out.println(s3.id=3);
		System.out.println(s3.marks=80);
		System.out.println(s3.name="ram");
		System.out.println(s3.school);
		
		Student.sign();
//		Student.salary();
	}

}
