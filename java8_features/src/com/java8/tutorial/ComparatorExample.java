package com.java8.tutorial;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.stream.Employee;

public class ComparatorExample {
	public static void main(String ...str) {
		// natural sorting
		Stream<Integer> stream = Stream.<Integer>of(1,2,3,6,4,9,7);
		System.out.println("element before sorting\n");
		stream.forEach(elem -> System.out.print(elem+" "));
		
		System.out.println("\nelement after soring.");
		Stream.<Integer>of(1,2,3,6,4,9,7).sorted().forEach(elem -> System.out.print(elem+" "));
		
		// reverse_sorting
		System.out.println("\n element after reverse order");
		Stream.<Integer>of(1,2,3,6,4,9,7).sorted(Comparator.reverseOrder())
		.forEach(elem -> System.out.print(elem+" "));
		
		
		// get developer list
		List<Developer> developers = Developer.getDeveloperList();
		
		Comparator<Developer> nameCom = (dev1, dev2) -> dev1.getName().compareTo(dev2.getName());
		System.out.println("\n********developer name default sorting order.************\n");
		developers.sort(nameCom);
		developers.stream().forEach(System.out::println);
		System.out.println("\n********developer name reverse order.************\n");
		developers.sort(nameCom.reversed());
		developers.stream().forEach(System.out::println);
		
		Set<String> setOfName = developers.stream().map(dev -> dev.getName())
				.collect(Collectors.toSet());
		System.out.println(setOfName);
		
		
	}
}
