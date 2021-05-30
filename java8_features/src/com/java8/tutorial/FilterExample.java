package com.java8.tutorial;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {
	public static void main(String ...strings ) {
		
		Supplier<Stream<String>> streamSupplier = () -> Stream.of("neeraj","ramesh","suresh", null, "Amit", "Varun",
				null, "Kamlesh", "Vimlesh");
		
		streamSupplier.get().filter(name -> name!=null).forEach(System.out::println);
		
		// count and grouping
		
		Map<String, Long> map = streamSupplier.get().filter(name -> name !=null).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
	}
}
