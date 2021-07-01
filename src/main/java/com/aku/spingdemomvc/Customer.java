package com.aku.spingdemomvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	private String firstName;
	
	@NotNull(message="should not be null")
	@Size(min=2, message="Min 2 char is required")
	private String lastName;
	
	@Min(value = 1, message = "Minimum pass should be 1")
	@Max(value = 5, message = "Max pass allowed is 5")
	private int freePasses;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 char or digits allowed")
	private String postalCode;

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

	public int getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
}
