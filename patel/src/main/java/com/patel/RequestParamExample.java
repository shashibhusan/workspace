package com.patel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
@Controller  
public class RequestParamExample
{  
	
    @RequestMapping(value = "/requestParamExample", method = RequestMethod.GET)
    public ModelAndView showForm(@RequestParam("username") String name, ModelMap  map) {
    	System.out.println("userName getting requestParam : "+name);
    	Employee e1= new Employee();
    	e1.setName("shashi bhusan patel");
    	map.addAttribute("example", "requestParamExample");
        return new ModelAndView("employeeHome", "employee", e1);
    }
  
     
}  