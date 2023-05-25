package com.rakuten;

public class Employee {
	
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public void displayName() {
		System.out.println("Welcome "+this.name);
	}

}
