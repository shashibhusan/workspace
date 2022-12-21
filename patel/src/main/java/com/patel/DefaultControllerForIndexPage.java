package com.patel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
@Controller
public class DefaultControllerForIndexPage {

		@RequestMapping("/") 
		    public ModelAndView loadHomePage(Model model) {
	    	 
	    	 System.out.println("DefaultControllerForIndexPage.java ||  @RequestMapping('/') will handle all the reqquest ");
	    	 model.addAttribute("loginAttribute", new Employee());
	    	 System.out.println("We need to add model attribite as below if we want to use modelAttribute='loginAttribute' on "
	    	 		+ "jsp page.To use spring form Tags on jsp \n");
	    	 System.out.println("model.addAttribute('loginAttribute', new Employee())");
		     return new ModelAndView("homePage");
		    } 
}
