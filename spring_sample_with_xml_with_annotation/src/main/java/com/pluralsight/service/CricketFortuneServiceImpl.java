package com.pluralsight.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CricketFortuneServiceImpl implements FortuneService {

	@Override
	public String getFortune() {
		return "Cricket fortune service";
	}

}
