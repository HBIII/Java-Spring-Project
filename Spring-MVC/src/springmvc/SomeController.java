package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SomeController {

	@RequestMapping("/showForm")
	public String display() {
		return "hello";
	}
}
