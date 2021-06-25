package com.aku.spingdemomvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;


@Controller
public class HelloWordController {
	
	//controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("processFormVersionTwo")
	public String letsShoutOut(HttpServletRequest request, Model model ) {
		String name = request.getParameter("studentName");
		String result = "Hello "+ name.toUpperCase();
		model.addAttribute("message",result);
		return "helloworld";
	}
}
