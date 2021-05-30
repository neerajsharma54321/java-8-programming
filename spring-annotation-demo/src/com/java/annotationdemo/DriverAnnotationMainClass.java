package com.java.annotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverAnnotationMainClass {
	public static void main(String []s) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// here we are using default bean id name to get the bean object.
		Coach coach = ctx.getBean("tennisCoach", Coach.class);
		System.out.println(coach.workout());
		
		Coach cricketCoach = ctx.getBean("cricketDemoWithUserDefinedId", Coach.class);
		System.out.println(cricketCoach.workout());
		
		ctx.close(); // when context will be close then destroy method will be called.
	}
}
