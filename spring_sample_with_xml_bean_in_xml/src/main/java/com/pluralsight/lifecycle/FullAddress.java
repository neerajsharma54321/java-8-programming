package com.pluralsight.lifecycle;

public class FullAddress {
	
	private String pincode;
	private Country country;
	
	public FullAddress(String pincode, Country country) {
		this.pincode = pincode;
		this.country = country;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	public String toString() {
		return country+", [pincode="+pincode+"]";
	}
	
}
