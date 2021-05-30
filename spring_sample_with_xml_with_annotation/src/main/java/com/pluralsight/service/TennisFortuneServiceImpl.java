package com.pluralsight.service;

import org.springframework.stereotype.Service;

@Service
public class TennisFortuneServiceImpl implements FortuneService {

	@Override
	public String getFortune() {
		return "Tennis fortune service";
	}

}
