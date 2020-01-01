package com.cdac.java.collection;

public class Employee {
	private int salary;
	private String name;
	
	public int getSalary() {
		return salary;
	}
	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
