package com.pluralsight.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.factory.AccountService;
import com.pluralsight.factory.ClientService;
import com.pluralsight.factory.DepartmentService;
import com.pluralsight.lifecycle.InitAndDestroy;
import com.pluralsight.lifecycle.InitDestroyMethodBeanDemo;
import com.pluralsight.service.CustomerService;

public class Main1 {
	public static void main(String ...strings) {
		
		// CustomerService customerService = new CustomerServiceImpl();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		// The above is sufficient but to demonstrate the init and destroy, I'm using the below containter. 
		AbstractApplicationContext actx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService customerService = ctx.getBean("customerService", CustomerService.class);
		System.out.println(customerService.getAll());
		
		// get object from static factory method. check the bean id
		ClientService clientService = ctx.getBean("clientService", ClientService.class);
		System.out.println(clientService.getMessage());
		
		// get object from normal method using factory bean
		AccountService accountService = ctx.getBean("accountService", AccountService.class);
		DepartmentService departmentService = ctx.getBean("departmentService", DepartmentService.class);
		System.out.println("departmentId = "+ departmentService.getDepartmentId()+ ", accountId ="+accountService.getAccountId());
		
		// demo of namespace for propery and constructor argument
		// and init and destroy method demo
		InitAndDestroy initAndDestroy = actx.getBean("initAndDestory", InitAndDestroy.class);
		System.out.println(initAndDestroy);
		
		InitDestroyMethodBeanDemo initDestoryMethodBeanDemo = actx.getBean("init-destory-using-interface", InitDestroyMethodBeanDemo.class);
		System.out.println(initDestoryMethodBeanDemo);
		
		actx.registerShutdownHook();
	
	}
}
