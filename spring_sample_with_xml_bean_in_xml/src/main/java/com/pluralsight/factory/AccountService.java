package com.pluralsight.factory;

public class AccountService {
	public AccountService() {
		System.out.println("AccountService");
	}
	
	public double getAccountId() {
		return Math.random();
	}
}
