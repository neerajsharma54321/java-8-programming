package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		Stream<String> stream1 = Stream.generate(() -> {return "abc";});
		Stream<String> stream2 = Stream.iterate("abc", (i) -> i);
		// System.out.println("st1"+stream1+"\n st2"+stream2);
		// stream2.forEach(s -> System.out.print(s));
		
		//We can use java Stream collect() method to get List, Map or Set from stream.
		Stream<Integer> intStream = Stream.<Integer>of(1,2,3,4);
		List<Integer> list =  intStream.collect(Collectors.toList());
		System.out.println(list);
		
		intStream = Stream.<Integer>of(1,2,3,4);
		Map<Integer, Integer> map = intStream.collect(Collectors.toMap(i -> i+1, i -> i+100));
		System.out.println("map"+map);
		
		// we can use stream toArray to create teh array
		Integer i [] = Stream.<Integer>of(1,2,3,4).toArray(Integer[]::new);
		System.out.println(Arrays.toString(i));
		
		// filter example - to get the number those are higher than 50.
		// please notice here. we are using parallel stream and forEachOreder :)
		List<Integer> myList = new ArrayList<>();
		for(int index=0; index<100; index++) myList.add(index);
		myList.parallelStream().filter(num -> num>50).forEachOrdered(n -> System.out.print(n+","));
		
		
		//map example: when we want to modify the data then will use map
		System.out.println("\n Map example \n");
		Stream<String> names = Stream.of("aBc", "d", "ef");
		names.map(d -> d.toUpperCase()).forEach(System.out::println);
		
		// stream sorted example
		Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
		names2.sorted().forEach(System.out::print);
		names2 = Stream.of("aBc", "d", "ef", "123456");
		List<String> sortedNamedList = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedNamedList);
		
		// Stream flatMap() example: We can use flatMap() to create a 
		// stream from the stream of list. Let’s see a simple example to clear this doubt.

		Stream<List<String>> namesOriginalList = Stream.of(
		Arrays.asList("Pankaj"), 
		Arrays.asList("David", "Lisa"),
		Arrays.asList("Amit"));
		
		namesOriginalList.flatMap(d -> d.stream()).forEach(System.out::println);
		
		// count and reduce example
		Stream<Integer> numbers = Stream.of(1,2,3,4,5);
		System.out.println(numbers.count());
		System.out.println(Stream.of(1,2,3,4,5).reduce((ij,j) -> {
			System.out.println("ij"+ij+", j ="+j);
			return ij+j;
		}));
		
		// match example
		Stream<Integer> numbers3 = Stream.of(1,2,3,4,5);
		boolean anyMathc = numbers3.anyMatch(p -> p>3);
		System.out.println(anyMathc);
		
			// allMatch
		System.out.println(Stream.of(1,2,3,4,5).allMatch(d -> d>10));
			//	none match
		System.out.println(Stream.of(1,2,3,4,5).noneMatch(d -> d>10));
		
		// findFirst example
		Stream<String> names4 = Stream.of("Pankaj","Amit","David", "Dhoni", "Lisa");
		Optional<String> optFirst = names4.filter(d -> d.startsWith("D")).findFirst();
		if(optFirst.isPresent()) {
			System.out.println(optFirst.get());
		}else {
			System.out.println(optFirst.orElse("nahi h jo dhundh rahe h"));
		}
		
		List<Integer> ss = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		List<Integer> result = new ArrayList<Integer>();
		 
		Stream<Integer> stream = ss.parallelStream();
		 
		stream.map(s -> {
		        synchronized (result) {
		          if (result.size() < 10) {
		            result.add(s);
		          }
		        }
//		        if (result.size() < 40) {
//		            result.add(s);
//		          }
				return s;
		    }).forEach( e -> {
		    	System.err.print(e+", ");
		    });
		 System.out.println("\n"+result); 
	}

}


