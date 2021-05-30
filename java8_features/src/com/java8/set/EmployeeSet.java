package com.java8.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.java8.stream.Employee;

public class EmployeeSet {
	
	public static Set<Employee> sampleEmployeeSet() {
		Set<Employee> employeeList = new LinkedHashSet<Employee>();
		employeeList.add(new Employee(1, "Ram", 50000, 15));
		employeeList.add(new Employee(2, "Ghanshyam", 80000, 22));
		employeeList.add(new Employee(6, "Ramesh", 50080, 45));
		employeeList.add(new Employee(9, "Suresh", 1000, 19));
		employeeList.add(new Employee(5, "Mahesh", 50000, 15));
		employeeList.add(new Employee(3, "Kamlesh", 990000, 22));
		employeeList.add(new Employee(4, "Junaid", 36000, 27));
		employeeList.add(new Employee(7, "Rampal", 51000, 30));
		employeeList.add(new Employee(7, "Rampal", 51000, 30));
		return employeeList;
	}
}
