
package com.java8.lambda;

import java.util.ArrayList;
import java.util.List;


public class FilterDataExample {
	public static void main(String str[]) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "Neeraj", "Sharma", 10000000, "Infosys", "Indore"));
		employeeList.add(new Employee(4, "Yash", "Verma", 1000, "Infosys", "Mujjafar Nagar"));
		employeeList.add(new Employee(3, "Nisha", "Mishra", 5000, "Infosys", "Patna"));
		employeeList.add(new Employee(2, "Ankit", "Sharma", 2000, "Mindtree", "Patna"));
		
		employeeList.forEach(employee -> System.out.println(employee));
		
		System.out.println("after filter salary");
		employeeList.stream().filter(employee -> employee.salary>2000).forEach(filteredEmployee ->{
			System.out.println(filteredEmployee);
		});
	}
}

