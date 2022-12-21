package com.order;

import org.springframework.stereotype.Component;

@Component
public class CarOne implements Car {

	private String carlook="carOne";
	@Override
	public String toString() {
		return carlook.toString();
	}
	
	public void carlook() {
		System.out.println("this is the look of car one");
	}

}
