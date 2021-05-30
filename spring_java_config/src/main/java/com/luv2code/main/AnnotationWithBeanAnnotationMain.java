package com.luv2code.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.config.AnnotationConfig;
import com.luv2code.service.Coach;
import com.luv2code.service.CricketCoach;

public class AnnotationWithBeanAnnotationMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext  ctx = 
				new AnnotationConfigApplicationContext(AnnotationConfig.class);
		Coach cricketCoach = ctx.getBean("cricketCoach", CricketCoach.class);
		
		System.out.println("cricket Coach"+cricketCoach.workout()+"\n"
				+ "cricket fortune"+ cricketCoach.getFortune());
		
		ctx.close();
	}

}
