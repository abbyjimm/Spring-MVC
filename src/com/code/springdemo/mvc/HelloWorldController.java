package com.code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	// Need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// Need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// Method to read data from the form
	// Using model to add data
	@RequestMapping("/processFormVersionModel")
	public String recoveringDataStudent(HttpServletRequest request, Model model) {
		
		// Read the request parameter from the HTML form
		String name = request.getParameter("studentName");
		
		// Convert the data 
		name = name.toUpperCase();
		
		// Create a message
		String result = name;
		
		// Add message to the Model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	// Method to read data from the form with Annotation RequestParam to specify form attribute 
	// Using model to add data
	@RequestMapping("/processFormVersionAnnotationParameter")
	public String recoveringDataStudentByAnnotation(@RequestParam("studentName") String name, Model model) {
		
		// Convert the data 
		name = name.toUpperCase();
		
		// Create a message
		String result = "Hello " + name;
		
		// Add message to the Model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
