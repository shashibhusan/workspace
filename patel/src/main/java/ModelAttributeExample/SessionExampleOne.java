package ModelAttributeExample;
import java.time.LocalDateTime;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@ComponentScan("ModelAttributeExample")
public class SessionExampleOne {
	
	@Autowired 
	private HttpSession httpSession;
	
	 @RequestMapping(value = "/sessionExampleOne", method = RequestMethod.GET)
	    public ModelAndView strudentHome(HttpSession httpSessionNext) {
		 httpSession.setAttribute("approchOne", "SessionExampleOne.java || This is the 1st Approch of session handling in Spring MVC");
		 httpSessionNext.setAttribute("approchTwo", "SessionExampleOne.java || This is the 2nd Approch of session handling in Spring MVC");
		 return new ModelAndView("ModelAttribute/modelAttributeOne");
	    }

	  
	 @ModelAttribute
	 public void settingHeading( Model model) {
		 
		 model.addAttribute("Heading", "This will be the common for all the request handle by controller SessionExampleOne.java");
		 
	    }
	 
	 	@ModelAttribute("time")
	    public LocalDateTime getRequestTime () {
	        return LocalDateTime.now();
	    }
	 	
	 
}
