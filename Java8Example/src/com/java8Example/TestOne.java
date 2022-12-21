package com.java8Example;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
 interface MyFirstFunctionalInterface
	{
		public void play();
	}

public class TestOne {

	public static void main(String[] args) {
		
		List list=new ArrayList<>();
		list.add("shashi");
		list.add("bhusan");
		list.add("Patel");
		list.forEach(l->{
			
			System.out.println(""+l);
		});
	}

}
