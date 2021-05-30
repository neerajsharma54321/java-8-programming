package com.pluralsight.service;

import org.springframework.stereotype.Service;

@Service
public class BaseBallFortuneServiceImpl implements FortuneService {

	@Override
	public String getFortune() {
		return "YOu have to throw baseball rod 100 times.";
	}

}
