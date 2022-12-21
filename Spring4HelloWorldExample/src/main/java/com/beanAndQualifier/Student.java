package com.beanAndQualifier;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void display() {
		System.out.println("This is the Display method of Student Class");
	}
	
}
