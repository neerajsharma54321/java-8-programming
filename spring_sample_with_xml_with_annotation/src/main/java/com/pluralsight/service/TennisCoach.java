package com.pluralsight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("tennisFortuneServiceImpl")
	private FortuneService fortuneService;
	
	@Override
	public String workout() {
		return "You will complete 10 round of tennis court.";
	}

	public String getFortune() {
		return this.fortuneService.getFortune();
	}

}
