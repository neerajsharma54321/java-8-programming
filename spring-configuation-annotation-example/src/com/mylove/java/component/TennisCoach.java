package com.mylove.java.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@PostConstruct
	public void setAllStuff() {
		System.out.println("all is set for running the application");
	}
	
	@Override
	public String workoutTime() {
		return "Your workout time will be 30  minutes for Tennis";
	}

	@PreDestroy
	public void closeAllStuff() {
		System.out.println( "All resources have been closed");
	}
}
