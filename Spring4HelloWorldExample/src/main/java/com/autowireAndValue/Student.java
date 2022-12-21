package com.autowireAndValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	/*
	 * Use of @value on field
	 */
    @Value("Student_name")
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	/*
	  Also use of @value annotation with Setter injection
	  Note:-Value Attribute will work only when this is setter injection
	 */
	@Autowired
	public void setAddress(@Value("Piluee bahadura ballia")String address) {
		this.address = address;
	}
	
	public void StudentDetail()
	{
		System.out.println("Student Detail : "+name+" "+address);
	}
	
}
