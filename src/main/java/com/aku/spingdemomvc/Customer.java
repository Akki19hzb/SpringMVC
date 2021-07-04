package com.aku.spingdemomvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.aku.springdemomvc.validations.CourseCode;

public class Customer {
	private String firstName;
	
	@NotNull(message="should not be null")
	@Size(min=2, message="Min 2 char is required")
	private String lastName;
	
	@NotNull(message="is required")    
	@Min(value = 1, message = "Minimum pass should be 1")
	@Max(value = 5, message = "Max pass allowed is 5")
	private Integer freePasses;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 char or digits allowed")
	private String postalCode;
	
	@CourseCode(value="IIT", message = "must start with IIT" )
	private String courseCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", freePasses=" + freePasses
				+ ", postalCode=" + postalCode + ", courseCode=" + courseCode + "]";
	}
	
}
