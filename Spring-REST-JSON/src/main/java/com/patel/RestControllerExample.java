package com.patel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.model.EmployeeInfo;

@RestController 
public class RestControllerExample {
	
	@RequestMapping(value = "/employees")
    public Employee getAllEmployees()
    {
		List<Employee> list=new ArrayList<Employee>();
          
        Employee empOne = new Employee(1,"Lokesh","Gupta","howtodoinjava@gmail.com");
        Employee empTwo = new Employee(2,"Amit","Singhal","asinghal@yahoo.com");
        Employee empThree = new Employee(3,"Kirti","Mishra","kmishra@gmail.com");
        
        System.out.println("================>>>>>>>>>>>>>>>>>>>");
        
        list.add(empOne);
        list.add(empTwo);
        list.add(empThree);
          
        return empOne;
    }

}
