package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
	
	@Autowired
	private CalculatorService calculator;
	
	@RequestMapping("/")
	public String home() {
		return "home";  //home.html
	}
	
	@PostMapping("/calculate")
	public String calculate(@RequestParam("num1") int num1, 
							@RequestParam("num2") int num2, 
							@RequestParam("operation") String operation, 
							Model model) {
		
		int res = 0;
		String errmsg= "..";
		if (operation.equals("ADD")) res = calculator.add(num1, num2);
		else if (operation.equals("SUB")) res = calculator.sub(num1, num2);
		else if (operation.equals("MUL")) res = calculator.mul(num1, num2);
		else if (operation.equals("DIV")) res = calculator.div(num1, num2);
		else if (operation.equals("MOD")) res = calculator.mod(num1, num2);
		else {
			errmsg = "Invalid Operation";
			System.out.println(errmsg);;
		}
		
		model.addAttribute("res", res); //Added result data to model object, so that html can access it!
		model.addAttribute("operation", operation);
		
		return "result";  //redirects to result.html
	}
}
