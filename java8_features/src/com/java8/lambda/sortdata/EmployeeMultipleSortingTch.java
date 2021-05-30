package com.java8.lambda.sortdata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMultipleSortingTch {
	public static void main(String ...s) {
		
		
		List<Employee> employeeList = new ArrayList<Employee>();
					   employeeList.add(new Employee("Sneha", 28));
					   employeeList.add(new Employee("Nisha Mishra", 28));
					   employeeList.add(new Employee("Nisha Mishra", 27));
					   employeeList.add(new Employee("Radhika", 59));
					   employeeList.add(new Employee("Ankit Sharma", 25));
					   employeeList.add(new Employee("Neeraj", 28));
		
		System.out.println("employee list before sorting\n"+employeeList);
					   
		System.out.println("employee list is sort by name");
		Collections.sort(employeeList, new EmployeeByNameSort());
		System.out.println(employeeList);
		
		
		System.out.println("employee list is sort by age");
		Collections.sort(employeeList, new EmployeeSortByAge());
		System.out.println(employeeList);
		
		System.out.println("employee list is sort by name then age");
		Collections.sort(employeeList, new EmployeeSortByNameThenAge());
		System.out.println(employeeList);
	}
}



/**
 * To sort the employee on the basis of name
 * @author Neeraj
 */
class EmployeeByNameSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
}

/**
 * To sort the employee on the basis of age
 * @author Neeraj
 */
class EmployeeSortByAge implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.age - o2.age;
	}
}

/**
 * To sort the employee on the basis of name and then age
 * @author Neeraj
 */
class EmployeeSortByNameThenAge implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		int nameComparatorResult = o1.name.compareTo(o2.name);
		
		int ageComparatorResult = o1.age - o2.age;
		
		// check whether the name are same
		if(nameComparatorResult == 0) {
			// if age are same then manage the insertion order. NO need to sort 
			return ageComparatorResult == 0 ? nameComparatorResult : ageComparatorResult;
		} else {
			return nameComparatorResult;
		}
	}
}

class Employee{
	String name;
	int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	
}
