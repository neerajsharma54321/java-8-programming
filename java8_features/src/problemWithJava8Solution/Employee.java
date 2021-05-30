package problemWithJava8Solution;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	int id;
	Double salary;
	String name;
	
	private static List<Employee> duplicateIdList;
	
	private static List<Employee> uniqueIdList;
	
	static{
		duplicateIdList = new ArrayList<Employee>();

		uniqueIdList = new ArrayList<Employee>();
		
		duplicateIdList.add(new Employee(1, 50000d, "Neeraj"));
		duplicateIdList.add(new Employee(1, 50000d, "Ramesh"));
		duplicateIdList.add(new Employee(1, 50000d, "Suresh"));
		duplicateIdList.add(new Employee(2, 50000d, "Kamlesh"));
		duplicateIdList.add(new Employee(2, 50000d, "Vimlesh"));
		duplicateIdList.add(new Employee(3, 50000d, "Mahesh"));
		duplicateIdList.add(new Employee(3, 2000d, "Yogesh"));
		duplicateIdList.add(new Employee(5, 1000d, "Ravi"));
		duplicateIdList.add(new Employee(5, 1000d, "Raj"));
		duplicateIdList.add(new Employee(4, 50000d, "Rahul"));
		duplicateIdList.add(new Employee(4, 50000d, "Mahajan"));
		duplicateIdList.add(new Employee(4, 50000d, "Kaviraj"));
		
		
		uniqueIdList.add(new Employee(1, 50000d, "Neeraj"));
		uniqueIdList.add(new Employee(9, 50000d, "Ramesh"));
		uniqueIdList.add(new Employee(10,50000d, "Suresh"));
		uniqueIdList.add(new Employee(5, 50000d, "Kamlesh"));
		uniqueIdList.add(new Employee(7, 50000d, "Vimlesh"));
		uniqueIdList.add(new Employee(6, 50000d, "Mahesh"));
		uniqueIdList.add(new Employee(3, 50000d, "Yogesh"));
		uniqueIdList.add(new Employee(2, 50000d, "Ravi"));
		uniqueIdList.add(new Employee(4, 50000d, "Raj"));
		uniqueIdList.add(new Employee(8, 50000d, "Rahul"));
		uniqueIdList.add(new Employee(12,50000d, "Mahajan"));
		uniqueIdList.add(new Employee(3, 50000d, "Kaviraj"));
		
		
	}
	
	public Employee(int id, Double salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	
	public static List<Employee> getAllUnorderedEmployee(){
		return uniqueIdList;
	}
	
	public static List<Employee> getDuplicateIdList(){
		return duplicateIdList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", salary=" + salary + ", name=" + name + "]\n";
	}
	
	
}
