package comparable;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * When we use comparable and comparator. It will be clear from below example.
 * 
 * Scenario => when the user wants to add Employee object in Treeset then few scenario will be generate.
 * 
 * 1.	If we directly wants to add Employee object then It will throw ClassCastException because only comparable
 * 		object we can add in the TreeSet. So employee class will have some default natural sorting.
 * 2.   Suppose if few users those are using Employee class and not satisfy with default natural sorting then 
 * 		they will provide customize sorting. In that case user will provide their own sorting with the use
 * 		of Comparator class.
 * 
 * */

public class ComparableAndComparatorUser {
	public static void main(String ...s) {
		Employee emp1 = new Employee("Neeraj", 27, "Indore");
		Employee emp2 = new Employee("Nisha", 27, "Patna");
		Employee emp3 = new Employee("Ankit", 24, "Patna");
		// System.out.println(emp1+ " \n"+ emp2 + "\n"+emp3 );
		
		
		TreeSet<Employee> treeSet = new TreeSet<Employee>();
		treeSet.add(new Employee("Neeraj", 27, "Indore"));
		treeSet.add(new Employee("Ajay", 27, "Indore"));
		treeSet.add(new Employee("Nisha", 27, "Indore"));
		treeSet.add(new Employee("Nilesh", 27, "Indore"));
		treeSet.add(new Employee("Vijay", 27, "Indore"));
		
		System.out.println(treeSet);
		
		TreeSet<Employee> ageT = new TreeSet<Employee>(new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return ((Integer)e2.age).compareTo((Integer)e1.age);
			}	
		});
		
		ageT.add(new Employee("Neeraj", 27, "Indore"));
		ageT.add(new Employee("Ajay", 27, "Indore"));
		ageT.add(new Employee("Nisha", 26, "Indore"));
		ageT.add(new Employee("Nilesh", 22, "Indore"));
		ageT.add(new Employee("Vijay", 20, "Indore"));
		
		System.out.println(ageT);
	}
}


class Person{
	public String name;
	public int age;
	public String city;
	
	public Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "name="+name+", age= "+age+",city = "+city;
	}	
}

class Employee extends Person implements Comparable<Employee>{
	
	private static int idIncrementor;
	
	private int id;
	
	public Employee(String name, int age, String city) {
		super(name, age, city);
		id = idIncrementor +=1;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ","+super.toString()+"]\n";
	}

	@Override
	public int compareTo(Employee employee) {
		return this.name.compareTo(employee.name);
	}
	
}