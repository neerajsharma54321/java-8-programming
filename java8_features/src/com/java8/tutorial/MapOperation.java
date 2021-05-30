
package com.java8.tutorial;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapOperation {

	public static void main(String[] args) {
		Supplier<Stream<Map<String, Developer>>> devMapSupplier = () -> Stream.of(Developer.getDeveloperMap());
		
		Map<String, Developer> devSortedMap = Developer.getDeveloperMap().entrySet().stream()
									.sorted(Map.Entry.comparingByKey())
									.collect(Collectors.toMap(
													Map.Entry::getKey, 
													Map.Entry::getValue,
													(old, newValue) -> old , LinkedHashMap::new
											));
	System.out.println(devSortedMap);
	}

}
