package com.aku.spingdemomvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName, lastName, country, favouriteLanguage, operatingSystems[];
	
	private LinkedHashMap<String,String> countryOptions, favouriteLanguageOptions;
	
	public Student() {
		countryOptions = new LinkedHashMap<String,String>();
		countryOptions.put("IN", "India");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("USA", "United States Of America");
		
		favouriteLanguageOptions = new LinkedHashMap<String, String>();
		favouriteLanguageOptions.put("Java", "Java");
		favouriteLanguageOptions.put("python", "Python");
		favouriteLanguageOptions.put("Perl", "Perl");
		favouriteLanguageOptions.put("C#", "C#");
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
		return favouriteLanguageOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
}
