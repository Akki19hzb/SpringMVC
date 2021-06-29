package com.aku.spingdemomvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		//Create the Student Object
		Student student = new Student();
		
		//add Student object to the model
		theModel.addAttribute("student", student);
		
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		//ModelAttribute Value should be same as the value in the view 
		System.out.println("the Student: "+ theStudent.getFirstName()+" "+ theStudent.getLastName());
		return "student-confirmation";
	}
}
