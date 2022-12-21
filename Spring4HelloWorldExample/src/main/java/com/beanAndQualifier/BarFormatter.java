package com.beanAndQualifier;

import org.springframework.stereotype.Component;

@Component
public class BarFormatter implements Formatter {

	public void format() {
		 
		System.out.println("This is the format method of BarFormatter");
		
	}

}
