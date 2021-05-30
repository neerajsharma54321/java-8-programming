package com.pluralsight.lifecycle;

public class Address{
	private String city;
	
	public Address(String city) {
		this.city = city;
	}
	
	public String toString() {
		return "Address [city ="+city+"]";
	}
}