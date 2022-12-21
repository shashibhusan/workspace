package com.autowireAndValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
   
	private String Ename;
	 
	private String address;
	 
	public String getEname() {
		return Ename;
	}
	@Autowired
	public void setEname(@Value("yes kumar")String ename) {
		Ename = ename;
	}
	
	public String getAddress() {
		return address;
	}
	/*
	 We can also use @Value with setter 
	*/
	@Value("Kamgar nager kurla")
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void EmployeeDetail()
	{
		System.out.println("Employee Detail is : "+Ename+" "+address);
	}
}
