package com.patel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.datamanager.EmployeeDAO;
import com.model.Employee;
@Controller  
public class HomePageSubmitAction
{  
    @InitBinder
    public void bhusan(WebDataBinder binder) {
        System.out.println("This is the InitBinder method of HomePageSubmitAction");
    	binder.setAllowedFields(new String[]{"name","contactNumber","id"});
    	/*
    	 This Custom Editor Example we will see this later in detail.
    	 */
    	//binder.registerCustomEditor(String.class, new CustomEditorExample());
	}    
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String submit(@ModelAttribute("emp")Employee emp, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        System.out.println("HomePageSubmitAction.java || This example show how  you will get form data in Action using Spring form Tag");
        model.addAttribute("name", emp.getName());
        model.addAttribute("contactNumber", emp.getContactNumber());
        model.addAttribute("id", emp.getId());
        EmployeeDAO.saveEmploye(emp);
        return "employeeView";
    }
    
     
}  