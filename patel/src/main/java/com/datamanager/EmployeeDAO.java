package com.datamanager;

import com.model.Employee;

public class EmployeeDAO {
	
	
	public static void saveEmploye(Employee e)
	{
	    System.out.println("Employee Detail : "+e.getId()+" "+e.getName()+" "+e.getContactNumber());	
	}

}
