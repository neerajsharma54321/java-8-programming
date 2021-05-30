package problemWithJava8Solution;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupPeopleByID {
	public static void main(String ...s) {
		
		Map<Integer, List<Employee>> map =  Employee.getDuplicateIdList().stream()
		.collect(Collectors.groupingBy(Employee:: getId, Collectors.toList()));
		
		System.out.println(map);
		
		// sum of salary id wise
		Map<Integer, Double> idWithTotalSal = Employee.getDuplicateIdList().stream()
		.collect(Collectors.groupingBy(
				Employee::getId, Collectors.summingDouble(Employee::getSalary)
		));
		
		System.out.println(idWithTotalSal);
		
		// id wise total salary and bonus if 
		// if salary is greater than > 50000 then bonus 10000
		// otherwise bonus is 20000
		
		 Map<Integer, List<Employee>> employeewithBonus = Employee.getDuplicateIdList().stream().
				map(data -> new Employee(data.id, getSalary(data.salary), data.name)).
				collect(Collectors.groupingBy(Employee::getId, 
						Collectors.toList()
						));
		 
		 // or
		 
		 Map<Integer, List<Employee>> m = Employee.getDuplicateIdList().stream().map(emp -> {
			 if(emp.salary > 50000) {
				 emp.salary +=20000;
			 }else emp.salary +=10000;
			 return emp;
		 }).collect(Collectors.groupingBy(Employee::getId, Collectors.toList()));
		 
		 System.out.println("EmployeeWith bonus example \n --------------------------------\n"
		 + m);
	}
	
	private static double getSalary(double salary) {
		return salary > 50000 ? salary + 10000 : salary + 20000;
	}
}


