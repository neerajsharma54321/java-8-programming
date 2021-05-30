package com.java.annotationdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component("cricketDemoWithUserDefinedId")
public class CricketCoach implements Coach {

	private CoachFee coachFee;
	
	private FortuneService fortuneService;
	
	
	// constructor injection
	@Autowired
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	// setter injection
	@Autowired
	public void setCoachFee(CoachFee fee) {
		this.coachFee = fee;
	}
	
	public String workout() {
		return "Please workout for the better fielding";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}


	@Override
	public String fee() {
		return this.coachFee.fee();
	}
	
	@PostConstruct
	public void doMyStuff() {
		System.out.println("do my stuff, after cons call");
	}
	
	@PreDestroy
	public void doEndMYStuff() {
		System.out.println("end all the process, after everything executed...");
	}
}
