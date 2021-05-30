package com.luv2code.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luv2code.service.Coach;
import com.luv2code.service.CricketCoach;
import com.luv2code.service.CricketFortuneService;
import com.luv2code.service.Fortune;

@Configuration
public class AnnotationConfig {
	
	@Bean
	public Coach cricketCoach() {
		return new CricketCoach(cricketFortuneService());
	}
	
	@Bean
	public Fortune cricketFortuneService() {
		return new CricketFortuneService();
	}
	
}
