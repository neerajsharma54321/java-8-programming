package com.java8.stream;

public class Employee {
	int id;
	String name;
	float salary;
	int age;

	public Employee(int id, String name, float salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
}
