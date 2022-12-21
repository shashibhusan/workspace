package com.autowireAndValue;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
/*
We can use the @Autowired to mark a dependency which Spring is going to resolve and inject.
We can use this annotation with a constructor, setter, or field injection.
in this example i am using all three autowiring.

We can use @Value for injecting property values into beans. 
It’s compatible with constructor, setter, and field injection.

*/
public class ConfigurableMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Pirate.class);
		Pirate bean = (Pirate) context.getBean(Pirate.class);
		System.out.println("Pirates name :"+bean.getName());
		System.out.println("Pirates employee name :"+bean.getEmpName());
		bean.getTreasureMap().display();
		bean.getEmployee().EmployeeDetail();
		bean.getStudent().StudentDetail();
	}
	
}
