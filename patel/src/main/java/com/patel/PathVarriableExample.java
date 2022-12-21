package com.patel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
@Controller  
public class PathVarriableExample
{  
	/*CONCEPT OF PATH VARRIABLE
	 * now when i will make request using http://localhost:8080/patel/login/shashi/pass123 
	 * then value of path variable means 'username' will be copy into name.
	 * here value of username will be 'shashi'
	 */
	
    @RequestMapping(value = "/login/{username}/{password}", method = RequestMethod.GET)
    public ModelAndView showForm(@PathVariable("username") String name,@PathVariable("password") String pass,ModelMap map ) {
    	System.out.println("userName getting from path varriable : "+name);
    	System.out.println("password getting from path varriable "+pass);
    	map.addAttribute("example", "PathVarriableExample");
    	Employee e1= new Employee();
    	e1.setName("shashi bhusan patel");
        return new ModelAndView("employeeHome", "employee", e1);
    }
     
}  