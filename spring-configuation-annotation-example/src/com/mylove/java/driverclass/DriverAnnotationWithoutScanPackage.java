package com.mylove.java.driverclass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mylove.java.component.SwimCoach;
import com.mylove.java.configuration.ApplicationConfigWithoutScan;

public class DriverAnnotationWithoutScanPackage {
	public static void main(String ...s) {
		AnnotationConfigApplicationContext context = null;
		try {	
			context = new AnnotationConfigApplicationContext(ApplicationConfigWithoutScan.class);
			SwimCoach swimCoach = context.getBean("swimCoach",SwimCoach.class);
			System.out.println(swimCoach.workoutTime());
			System.out.println(swimCoach.getFortune());
			
			System.out.println(swimCoach.getMaxSpeed()+ "\n" +swimCoach.getComment());
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			context.close();
		}
	}
}
