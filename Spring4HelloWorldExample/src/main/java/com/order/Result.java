package com.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan ({"com.order"})
public class Result {
	@Autowired
	private List<Car> car;

	@Override
	public String toString() {
		return car.toString();
	}
	
}
