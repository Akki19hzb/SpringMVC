package com.aku.springdemomvc.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	//ConstraintValidator<annotaion-name, Type of element to be validated>
	public String coursePrefix;
	
	@Override
	public void initialize(CourseCode constraintAnnotation) {
		// this holds the value of the annotation
		coursePrefix = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		// TODO Auto-generated method stub
		boolean result;
		if(theCode != null) {
			//theCode variable holds the value supplied in the form and 
			//coursePrefix variable holds the value of the annotation
			// 
			result = theCode.startsWith(coursePrefix);
			System.out.println("Result"+ result);
		}
		else {
			result = true;
		}
		
		return result;
	}

}
