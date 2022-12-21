package com.patel;

import java.beans.PropertyEditorSupport;

 
public class CustomEditorExample extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		System.out.println("CustomEditorExample.java || This is a Custom editor Class");
		
	}
	
}
