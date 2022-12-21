package com.order;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class OrderMain {

public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(Result.class);
	Result bean = (Result) context.getBean(Result.class);
	System.out.println(bean);
	System.out.println("Here we are storing the component in order in List collection");
}
	
}
