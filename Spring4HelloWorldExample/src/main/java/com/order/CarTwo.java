package com.order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class CarTwo implements Car {

   private String carlook="carTwo";
	
	@Override
	public String toString() {
		return carlook.toString();
	}
	
	public void carlook() {
		System.out.println("This is the look for car two");
	}

}
