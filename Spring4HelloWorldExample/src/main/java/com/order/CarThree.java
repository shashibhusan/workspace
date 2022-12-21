package com.order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CarThree implements Car{

private String carlook="carThree";
	
	@Override
	public String toString() {
		return carlook.toString();
	}
	
	public void carlook() {
		System.out.println("This is the look for car three");
	}

}
