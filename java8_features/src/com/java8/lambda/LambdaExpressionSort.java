package com.java8.lambda;

import java.util.Arrays;

public class LambdaExpressionSort {
	public static void main(String ...s) {
		
		Employee empArray[] = {
				new Employee(1, "Neeraj", "Sharma", 10000000, "Infosys", "Indore"),
				new Employee(4, "Yash", "Verma", 550000, "Infosys", "Mujjafar Nagar"),
				new Employee(3, "Nisha", "Mishra", 1000000, "Infosys", "Patna"),
				new Employee(2, "Ankit", "Sharma", 5000000, "Mindtree", "Patna")
		};
		
		
		System.out.println("before sorting\n"+ Arrays.toString(empArray));
		// method reference example to the static method
		Arrays.sort(empArray, Employee::employeeNameCompare);
		 
		System.out.println("After sorting\n"+ Arrays.toString(empArray));
		
		Arrays.sort(empArray, Employee::employeeIdCompare);
		
		System.out.println("after id sorting\n::"+ Arrays.toString(empArray));
		
	}
}

class Employee{
	Integer id;
	String firstName;
	String lastName;
	float salary;
	String employer;
	String city;
	
	public Employee(Integer id, String firstName, String lastName, float salary, String employer, String city) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.employer = employer;
		this.city = city;
	}

	public static int employeeNameCompare(Employee e1, Employee e2) {
		return e1.firstName.compareTo(e2.firstName);
	}
	
	public static int employeeIdCompare(Employee e1, Employee e2) {
		if(e1.id > e2.id)
			return 1;
		else if(e1.id < e2.id)
			return -1;
		else return 0;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", employer=" + employer + ", city=" + city + "]\n";
	}	
}
