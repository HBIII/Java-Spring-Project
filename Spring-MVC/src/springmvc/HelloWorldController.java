package springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/happy")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormV2")
	public String upper(HttpServletRequest request, Model model)
	{
		String temp=request.getParameter("studentName");
		
		temp=temp.toUpperCase();
		
		String result = "Get Back here!! "+temp;
		
		model.addAttribute("message",result);
		return "helloworld";
	}
	
	
	/*Binding Request Params*/
	
	@RequestMapping("/processFormV3")
	public String lower(@RequestParam("studentName") String temp , Model model)
	{
		temp=temp.toLowerCase();
		
		String result = "Get Back here!! "+temp;
		
		model.addAttribute("message",result);
		return "helloworld";
	}
	
	
}
