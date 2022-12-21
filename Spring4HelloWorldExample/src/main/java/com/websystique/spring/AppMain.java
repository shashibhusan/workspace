package com.websystique.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.patel.Senet;
import com.patel.ToolRoom;
import com.senet.Sanctioned;
import com.websystique.spring.configuration.HelloWorldConfig;
import com.websystique.spring.domain.HelloWorld;

public class AppMain {

	public static void main(String args[]) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
		bean.sayHello("Spring 4"); 
		
		/*ToolRoom toolroom = (ToolRoom) context.getBean(ToolRoom.class);
		toolroom.display();*/
		
		/*System.out.println("set default value : "+toolroom.getName());*/
		
		Senet senetBean = (Senet) context.getBean("senetBean");
		senetBean.GetSenetValue();
		
		Sanctioned sanctionBean = (Sanctioned) context.getBean(Sanctioned.class);
		
		context.close();
	}

}
