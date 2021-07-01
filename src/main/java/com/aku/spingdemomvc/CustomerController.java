package com.aku.spingdemomvc;

import javax.validation.Valid;

import org.hibernate.validator.internal.IgnoreForbiddenApisErrors;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	/*@InitBinder to remove the leading and trailing whitespace
	 * resolve the issue of the validation
	 * */  
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, ste);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult bindingResult) {
		System.out.println("LastName:|"+theCustomer.getLastName()+"|");
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}
		else {
		
		return "customer-confirmation";
		}
	}
}
