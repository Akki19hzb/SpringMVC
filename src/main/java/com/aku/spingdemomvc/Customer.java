package com.aku.spingdemomvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	private String firstName;
	
	@NotNull(message="should not be null")
	@Size(min=2, message="Min 2 char is required")
	private String lastName;

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
	
}
