package com.code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/showForm")
	public String displayForm() {
		return "helloworld-form";
	}
}
