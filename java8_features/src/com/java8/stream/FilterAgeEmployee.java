package com.java8.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterAgeEmployee {

	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeList.sampleEmployeeList();
		
		long count = employeeList.stream().filter(employee -> employee.id>5).count();
		System.out.println("count"+count);
		
		// filtering the data whose salary is greater than 22 
		List<Employee> employeeWithAgeGreater22 = 	employeeList.stream()
													.filter(employee -> employee.age > 22)
													.map(employee -> employee)
													.collect(Collectors.toList());
		employeeWithAgeGreater22.stream().forEach(System.out::println);
		
		// collect the group of ids whose salary is greater than 10000
		List<Integer> employeeWithSalaryG10000 = employeeList.stream().filter(employee -> employee.salary > 10000).map(employee -> employee.id).collect(Collectors.toList());
		employeeWithSalaryG10000.stream().forEach(System.out::print);
		
		
		// reducer function.
		// find the total salary 
		float totalEmployeesSalary = employeeList.stream().map(employee -> employee.salary).reduce(0.0f, (sum, salary) -> sum + salary);
		System.out.println("total salary"+totalEmployeesSalary);
		// or
		float salarySUm =employeeList.stream().map(employee -> employee.salary).reduce(0.0f, Float::sum);
		System.out.println("sum salary"+salarySUm);
		
		// summing
		double totalSalary = employeeList.stream().collect(Collectors.summingDouble(employee -> employee.salary));
		System.out.println("totalSalary"+totalSalary);
		
		// find the employee with min and max salary
		Employee employeeWithMinSalary = employeeList.stream().min((emp1, emp2)-> emp1.salary > emp2.salary ? 1 : -1).get();
		System.out.println("employeeWithMinSalary ="+employeeWithMinSalary);
		
		// using comparator class
		Employee employeeWIthMaxSalary = employeeList.stream().max(new EmployeeMaxComparator()).get();
		System.out.println("employeeWithMaxSalary ="+employeeWIthMaxSalary);
	}

}

class EmployeeMaxComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.salary > o2.salary ? 1 : -1;
	}
	
}
