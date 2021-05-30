package com.pluralsight.factory;

public class DepartmentService {
	public DepartmentService() {
		System.out.println("DepartmentService");
	}
	
	public double getDepartmentId() {
		return Math.abs(Math.random());
	}
}
