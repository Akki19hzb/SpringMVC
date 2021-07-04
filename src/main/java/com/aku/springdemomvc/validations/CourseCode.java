package com.aku.springdemomvc.validations;
import java.lang.annotation.ElementType;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Retention(RUNTIME)
@Target({ ElementType.METHOD, ElementType.FIELD })
public @interface CourseCode{

	public String value() default "BIT";
	
	public String message() default "Must start with BIT";
	
	Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
