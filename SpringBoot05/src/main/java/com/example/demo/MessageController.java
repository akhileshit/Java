package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;   // import model from ui only
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
	
	@GetMapping("/greet")  
	public String getContent(Model model) { // Asking for the Model 
		model.addAttribute("msg1", "WELCOME TO KODNEST");
		return "greet";  //Searches for greet html page in templates
	}
}

// Can also use @RequestMapping instead @GetMapping (Diff in later classes)
// Model is created and managed by 