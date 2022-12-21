package ModelAttributeExample;
import java.time.LocalDateTime;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@ComponentScan("ModelAttributeExample")
public class ModelAttributeExample {
	
	@Autowired 
	 private HttpSession httpSession;
	
	@Autowired
	 private CompanyName company;// Just Checking the Autowiring concept.
	
	 	
	 	@ModelAttribute("time")
	    public LocalDateTime getRequestTime () {
	        return LocalDateTime.now();
	    }
	 
		 @RequestMapping(value = "/modelAttributeExampleSubmit", method = RequestMethod.POST)
		 
		 // Importance of "st" is that we will refer this on jsp page(modelAttributeTwo.jsp). 
		 
		    public ModelAndView strudentDetail(@ModelAttribute("st") Student student, BindingResult bindingResult, ModelMap model ,HttpSession secondApproch) {
			 
			 System.out.println("in side ModelAttributeExample.java || strudentDetail() student name :- "+student.getStudentName());
			  
			 System.out.println("ModelAttributeExample.java || Value that we get from session approchOne : \n"+httpSession.getAttribute("approchOne"));
			 
			 System.out.println("ModelAttributeExample.java || Value that we get from session approchTwo : \n"+httpSession.getAttribute("approchTwo"));
			 
			 System.out.println("ModelAttributeExample.java || Value of the address in CompanyName class : \n"+company.getAddres());
			 
			 System.out.println("This Example also shows how you get submit form using simple HTML");
			 
			 Student studentObj=new Student();
			 studentObj.setStudentHobby("Listening old songs");
			 studentObj.setStudentName("chandra bhusan patel");
			 
			 model.addAttribute("name", studentObj);
			 model.addAttribute("hobby", "To watch IPL");
			 return new ModelAndView("ModelAttribute/modelAttributeTwo");
	    }

		 
}
