package com.senet;

import org.springframework.stereotype.Component;

@Component
public class Sanctioned {

	private String name_of_month;
	private int amount;
	public String getName_of_month() {
		return name_of_month;
	}
	public void setName_of_month(String name_of_month) {
		this.name_of_month = name_of_month;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	} 
	
	public Sanctioned() {
		System.out.println("This is the sanctioned method of Sanctioned class");
	}
	
	public void SanctionedDisplay()
	{
		System.out.println("This is the display method of sanctioned class");
	}
	
}
