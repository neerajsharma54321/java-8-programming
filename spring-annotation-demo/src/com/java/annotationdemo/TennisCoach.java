package com.java.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	private CoachFee coachFee;
	
	// constructor injection
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	// setter injection
	@Autowired
	public void setCoachFee(CoachFee fee) {
		this.coachFee = fee;
	}
	
	public String workout() {
		return "You guys should have to workout atleast 2 hours";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String fee() {
		return this.coachFee.fee();
	}
}
