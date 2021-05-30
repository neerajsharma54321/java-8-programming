package com.luv2code.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private Fortune tennisFortuneService;
	
	@Value("${mysql.username}")
	private String databaseUserName;
	
	@Value("${mysql.password}")
	private String databasePass;
	
	@Value("${mysql.maxconnection}")
	private String databaseMaxConn;
	
	@Autowired
	public TennisCoach(@Qualifier("tennisFortuneService")Fortune tennisFortuneService) {
		this.tennisFortuneService = tennisFortuneService;
	}
	
	@Override
	public String workout() {
		return "You have to play tennis 5 hours/day.";
	}

	@Override
	public String getFortune() {
		return this.tennisFortuneService.getFortune();
	}

	
	public String properties() {
		return "username ="+databaseUserName+", password = "+databasePass+", max connection ="+databaseMaxConn;
	}
}
