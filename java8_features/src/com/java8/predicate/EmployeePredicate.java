package com.java8.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicate {
	
	public static Predicate<Employee> isAdultMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }
	
	public static Predicate<Employee> isAdultFemale() {
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
    }
	
	public static Predicate<Employee> isAgeMoreThan(int age) {
		return p -> p.getAge() > age;
	}
	
	 public static List<Employee> filterEmployees (List<Employee> employees, 
             Predicate<Employee> predicate) 
		{	 
		return employees.stream()
		.filter( predicate )
		.collect(Collectors.<Employee>toList());
		}
	
}
