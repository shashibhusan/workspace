package com.beanAndQualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ConfigurableMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		ConfigurationClass configurationClass=(ConfigurationClass)context.getBean("configuration");// With bean name
		Student student=(Student)context.getBean("studentBean"); // With bean name
		Employee employee=(Employee)context.getBean(Employee.class);// Without bean name
		student.display();
		configurationClass.display();
		configurationClass.getBarFormatter().format();
		configurationClass.getFormatter().format();
		employee.display();
	}
	
}
