package com.luv2code.service;

public class CricketCoach implements Coach {

	private Fortune fortuneService;
	
	public CricketCoach(Fortune fortuneService) {
		this.fortuneService = fortuneService;
	}
		
	@Override
	public String workout() {
		return "10 round of cricket ground as workout.";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
