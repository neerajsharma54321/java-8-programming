package com.luv2code.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.config.AnnotationConfigWIthCompScan;
import com.luv2code.service.TennisCoach;

public class AnnotationWIthCompScanDemo {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext  ctx = 
				new AnnotationConfigApplicationContext(AnnotationConfigWIthCompScan.class);
		TennisCoach tennisCoach = ctx.getBean("tennisCoach", TennisCoach.class);
		
		System.out.println("cricket Coach"+tennisCoach.workout()+"\n"
				+ "cricket fortune"+ tennisCoach.getFortune());
		
		System.out.println("prop file properties "+tennisCoach.properties());
		
		ctx.close();
	}

}
