package com.pluralsight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseBallCoach() {
		super();
	}

	@Override
	public String workout() {
		return "Lift the baseball 10 times.";
	}

	@Override
	public String getFortune() {
		return this.fortuneService.getFortune();
	}

	@Autowired
	@Qualifier("baseBallFortuneServiceImpl")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	

}
