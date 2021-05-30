package com.mylove.java.component;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${maxswim}")
	private int maxSpeed;
	
	@Value("${comment}")
	private String comment;
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String workoutTime() {
		return "your workout time for swimming is 45 minutes";
	}

	
	public String getFortune() {
		return this.fortuneService.getFortune();
	}
}
