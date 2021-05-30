package com.pluralsight.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.Coach;
import com.pluralsight.service.CustomerService;

public class Main1 {
	public static void main(String ...strings) {
		
		// CustomerService customerService = new CustomerServiceImpl();
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		// check the CustomerServiceImpl
		// we are using specified name to get the bean
		// also we are using property base autowiring
		// CustomerService customerService = ctx.getBean("customerkouthalo", CustomerService.class);\
		CustomerService customerService = ctx.getBean("customerService", CustomerService.class);
		System.out.println(customerService.getAll());
		
		// qualifier example constructor base autowiring
		Coach cricketCoach = ctx.getBean("cricketCoach", Coach.class);
		System.out.println(cricketCoach.workout()+"\n"+cricketCoach.getFortune());
		
		// qualifier example property base autowiring
		Coach tennisCoach = ctx.getBean("tennisCoach", Coach.class);
		System.out.println(tennisCoach.workout()+"\n"+tennisCoach.getFortune());
		
		// qualifier example setter base autowiring
		Coach baseballCoach = ctx.getBean("baseBallCoach", Coach.class);
		System.out.println(baseballCoach.workout()+"\n"+baseballCoach.getFortune());
		
		ctx.close();
	}
}
