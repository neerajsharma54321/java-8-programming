package com.pluralsight.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.lifecycle.FullAddress;
import com.pluralsight.lifecycle.InitAndDestroy;

public class AutowiringDemo {
	public static void main(String ...s) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("autowiringContext.xml");
		
		InitAndDestroy initAndDestroy = ctx.getBean("initAndDestory", InitAndDestroy.class);
		System.out.println("init and destroy using byName autowiring"+ initAndDestroy);

		InitAndDestroy initAndDestoryByType = ctx.getBean("initAndDestoryByType", InitAndDestroy.class);
		System.out.println("init and destroy using byType autowiring"+ initAndDestoryByType);

		FullAddress fullAddress = ctx.getBean("fullAddress", FullAddress.class);
		System.out.println("displaying fullAddress byConstructor autowiring"+ fullAddress);

			
	}
	
}
