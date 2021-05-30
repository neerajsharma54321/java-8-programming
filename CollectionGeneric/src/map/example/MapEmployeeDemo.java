package map.example;

import java.util.HashMap;
import java.util.Map;

public class MapEmployeeDemo {

	public static void main(String[] args) {
		Map<Employee, Integer> map = new HashMap<Employee, Integer>();
		map.put(new Employee(1, 1, "a"), 1);
		map.put(new Employee(2, 1, "bc"), 1);
		map.put(new Employee(3, 1, "a"), 1);
		map.put(new Employee(1, 1, "a"), 1);
		System.out.println(map);
	}

}

class Employee{
	int id, salary;
	String name;
	
	public Employee(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]\n";
	}
	
}
