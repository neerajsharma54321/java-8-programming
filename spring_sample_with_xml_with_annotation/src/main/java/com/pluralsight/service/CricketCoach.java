package com.pluralsight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public CricketCoach(@Qualifier("cricketFortuneServiceImpl")FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String workout() {
		return "You will complete 10 round of cricket ground.";
	}
	
	public String getFortune() {
		return this.fortuneService.getFortune();
	}

}
