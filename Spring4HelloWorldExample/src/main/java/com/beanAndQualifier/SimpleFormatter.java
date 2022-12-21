package com.beanAndQualifier;

import org.springframework.stereotype.Component;

@Component
public class SimpleFormatter implements Formatter {

	public void format() {
		
		System.out.println("This is the format Method of SimpleFormatter");
		
	}

}
