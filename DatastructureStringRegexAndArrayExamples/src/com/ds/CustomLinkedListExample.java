package com.ds;

public class CustomLinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		// linkedList.remove();
		
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(45);
		linkedList.add(9);
//		linkedList.add(8);
		
		linkedList.printAll();
		
		linkedList.remove(4);
// 		linkedList.remove();
		
		linkedList.printAll();
//		linkedList.printAll();
//		Integer i = linkedList.get(1);
//		System.out.println(i);
//		i = linkedList.get(4);
//		System.out.println(i);
		
		System.out.println("size of linkedlist ="+linkedList.size());
		
//		System.out.println("------------------Student---------------------");
//		LinkedList<Employee> employeeList = new LinkedList<>();
//		employeeList.add(new Employee(1, "Neeraj"));
//		employeeList.add(new Employee(2, "Ram"));
//		employeeList.add(new Employee(3, "Raj"));
//		employeeList.add(new Employee(5, "Aayega"));
//		employeeList.printAll();
//		employeeList.remove();
//		employeeList.printAll();
		
//		java.util.LinkedList<Integer> list =  new java.util.LinkedList<>();
//		list.add(5);
//		list.add(4);
//		list.add(9);
//		list.add(1);
//		System.out.println(list);
//		list.remove();
//		System.out.println(list);
//		list.remove(2);
//		System.out.println(list);
////		 output
//		[5, 4, 9, 1]
//				[4, 9, 1]
//				[4, 9]
	}

}


