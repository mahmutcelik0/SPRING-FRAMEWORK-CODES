package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class BetterCountry {
	private String countryName;
	private LinkedHashMap<String,String> countryItems;
	
	
	public BetterCountry() {
		countryItems = new LinkedHashMap<>();
		
		countryItems.put("BR", "BRAZIL");
		countryItems.put("TR", "TURKEY");
		countryItems.put("DE", "GERMANY");
		countryItems.put("US", "UNITED STATES of AMERICA");
		countryItems.put("FR", "FRANCE");
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public LinkedHashMap<String, String> getCountryItems() {
		return countryItems;
	}
	
	
}
