package com.pluralsight.factory;

public class ClientInstanceFactoryClass {
	private AccountService accountService = new AccountService();
	private DepartmentService departmentService = new DepartmentService();
	
	public AccountService getAccountService() {
		return accountService;
	}
	
	public DepartmentService getDepartmentService() {
		return departmentService;
	}
}
