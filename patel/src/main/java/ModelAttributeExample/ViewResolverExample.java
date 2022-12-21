package ModelAttributeExample;

import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ComponentScan("ModelAttributeExample")
public class ViewResolverExample {

	@RequestMapping(value = "/VeiwResolverExample", method = RequestMethod.GET)
    public ModelAndView strudentHome(HttpSession httpSessionNext) {
		
	 return new ModelAndView("xmlviewResolverExample");
    }
	
	@RequestMapping(value = "/ResourceBundleViewResolver", method = RequestMethod.GET)
    public ModelAndView Home(HttpSession httpSessionNext) {
		
	 return new ModelAndView("ResourceBundleViewResolver");
    }
	
}
