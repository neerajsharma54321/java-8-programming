package com.pluralsight.lifecycle;

public class Country {
	
	private String state;
	private String city;
	
	public Country(String state, String city) {
		this.state = state;
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
		return "Country [state = "+state+", City = "+city+"]";
	}
}
