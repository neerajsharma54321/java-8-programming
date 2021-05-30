package com.java.annotationdemo;

import org.springframework.stereotype.Component;

@Component
public class AllFee implements CoachFee {

	@Override
	public String fee() {
		return "THis time all the fees are same for all.";
	}

}
