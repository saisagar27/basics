package com.ty.constructors;

public class COverloading {

	 private int no;
	 private String name;
	 private int id;
	 public COverloading() {
		 System.out.println("Default Constructor");
		 
	 }
		
	 public COverloading(int no,int id) {
		 this.no=no;
		 this.id=id;
		 
	 }
	 
	 public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public COverloading(int no,String name,int id) {
		 this.no=no;
		 this.name=name;
		 this.id=id;
		 
	 }
	 
		
	}

