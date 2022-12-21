package com.senet;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Incubator {

	public void display() {
		System.out.println("This is the public method inside Incubator class");
	}

	public Incubator() {
		System.out.println("incubator class intialized");
	}
	
	
}


