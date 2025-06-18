package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {
	
	@Autowired
	MessageService messageService;    //Field Injection
	
	@RequestMapping("/")    
	public String home() {
		return "home";
	}
	
	@PostMapping("/greet")           //Since we have specified method attribute in html as "post" to /greet
	public String sendMessage(@RequestParam("un") String name, Model model) {             //get the data inside "un" from the request-string and store it inside a name variable, and create the Model to store some data
		String msg = messageService.buildMessage(name);          //call this method from this class (just to differentiate controller and service).
		model.addAttribute("msg", msg);         //add the data to Model to be used by html. It looks like the similar concept in servlet right? (maybe in servlet-chaining!!)
		return "greet";
	}
}

// w/o thymeleaf dependency installed, the code related to it wont work (like model and th:text=${msg} in html)
// Thymeleaf acts like a bridge b/w controller and Html!
// Something that handles the data, we call it "Model" right...