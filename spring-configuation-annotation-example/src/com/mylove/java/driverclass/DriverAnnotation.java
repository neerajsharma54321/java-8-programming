package com.mylove.java.driverclass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mylove.java.component.Coach;
import com.mylove.java.configuration.ApplicationConfig;

public class DriverAnnotation {
	public static void main(String str[]) {
		AnnotationConfigApplicationContext context = null;
		try {
			context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
			Coach coach = context.getBean("tennisCoach", Coach.class);
			System.out.println(coach.workoutTime());
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			context.close();
		}
	}
} 
