package com.mylove.java.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.mylove.java.component.Coach;
import com.mylove.java.component.FortuneService;
import com.mylove.java.component.SwimCoach;
import com.mylove.java.component.SwimFortuneService;

@Configuration
@PropertySource("classpath:swim.properties")
public class ApplicationConfigWithoutScan {
	
	@Bean
	public FortuneService swimFortuneService() {
		return new SwimFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(swimFortuneService());
	}
}
