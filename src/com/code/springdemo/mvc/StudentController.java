package com.code.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;
	
	@RequestMapping("/mainForm")
	public String mainFormStudent(Model model) {
		
		// Create a student object
		Student student = new Student();
		
		// Add student object to the model
		model.addAttribute("student", student);
		
		model.addAttribute("countryOptions", countryOptions);
		
		return "student-form";
	}
	
	@RequestMapping("/processStudent")
	public String processStudent(@ModelAttribute("student") Student student) {
		
		// Load the input data
		System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
		
		return "student-confirmation";
	}
}
