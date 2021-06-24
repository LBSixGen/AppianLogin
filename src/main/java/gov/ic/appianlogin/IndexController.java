package gov.ic.appianlogin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@GetMapping("/appian")
	public String getHello(Model model) {
		model.addAttribute("hello","Appian v1.0.1");
		return "hello";
	}
	
	@GetMapping("/form")
	public ModelAndView getForm() {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("form");
	    return mv;
		}

}
