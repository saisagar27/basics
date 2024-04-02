package com.ty.encapsulation;

public class Encaplusation {
	
	private int id;
	private String name;
	private int salary;
	private String job;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary>500)
		this.salary = salary;
		else
			System.out.println("More than 500");
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	

}
