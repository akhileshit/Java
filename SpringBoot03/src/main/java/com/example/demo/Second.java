package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Second {
	
	@RequestMapping("/getsurp")
	@ResponseBody     
	public String surprise() {
		return "HOLAAA SURPRISE!.....";
	}
}


// This is also a Controller
// Every class(Controller) here is converted to "servlet" by SpringBoot!
// You can write any # Controllers!!