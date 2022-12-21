package com.senet;

import org.springframework.stereotype.Component;

@Component
public class TestResource {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display()
	{
		System.out.println("This is the display method of TestResource class");
	}

}
