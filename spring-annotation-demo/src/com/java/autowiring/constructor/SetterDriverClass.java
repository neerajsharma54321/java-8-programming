package com.java.autowiring.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.annotationdemo.Coach;

public class SetterDriverClass {
	public static void main(String []s) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// here we are using default bean id name to get the bean object.
		Coach coach = ctx.getBean("tennisCoach", Coach.class);
		System.out.println(coach.workout());
		
		Coach cricketCoach = ctx.getBean("cricketDemoWithUserDefinedId", Coach.class);
		System.out.println(cricketCoach.workout());
		System.out.println(cricketCoach.getFortune());
		System.out.println(cricketCoach.fee());
		
		System.out.println("--------------------------------------------------------");
		
		Coach tennisCoach = ctx.getBean("tennisCoach", Coach.class);
		System.out.println(tennisCoach.workout());
		System.out.println(tennisCoach.getFortune());
		System.out.println(tennisCoach.fee());
	}
}
