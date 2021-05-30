package com.luv2code.service;

import org.springframework.stereotype.Service;

@Service
public class TennisFortuneService implements Fortune {

	@Override
	public String getFortune() {
		return "I'm your tennis fortune service.";
	}

}
