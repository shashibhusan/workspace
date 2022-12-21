package com.patel;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.senet.Incubator;
import com.senet.Sanctioned;
import com.senet.TestResource;

@Component
@Order(1)
public class ToolRoom {
	@Value("shashi bhusan patel")
	private String name;
	private String password; 
	@Autowired
	private Incubator incubator;
	@Autowired
	private Sanctioned sanction;
	@Resource 
	private TestResource resource; // means we using a different resource for this property 
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Sanctioned getSanction() {
		return sanction;
	}
	
	public void setSanction(Sanctioned sanctioned) {
		this.sanction = sanctioned;
	}
	
	public Incubator getIncubator() {
		return incubator;
	}
	// @Autowired you can use this here
	public void setIncubator(Incubator incubator) {
		this.incubator = incubator;
	}
	
	public TestResource getResource() {
		return resource;
	}
	public void setResource(TestResource resource) {
		this.resource = resource;
	}
	public void display()
	{
		System.out.println("This is the display method of the ToolRoom Class");
		sanction.SanctionedDisplay();
		incubator.display();
		resource.display();
	}
	
}
