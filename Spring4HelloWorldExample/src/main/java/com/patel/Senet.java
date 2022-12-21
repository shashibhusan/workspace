package com.patel;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class Senet {
	  
	private String name;
	
	public Senet() {
		 System.out.println("Senet class intialized");
	}
	public void GetSenetValue() {
		
		System.out.println("This is the  method of senet Class");
	}
	@Bean(name="senetBean")
	public Senet GetSenet() {
		return new Senet();
		 
	}
	public String getName() {
		return name;
	}
	@Required
	@Value("shashi bhusan patel")
	public void setName(String name) {
		this.name = name;
	}

}
