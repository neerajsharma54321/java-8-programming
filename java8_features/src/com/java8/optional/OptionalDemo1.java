package com.java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo1 {
	public static void main(String ...strings) {
		List<Integer> list = Arrays.asList(2,5,6,9,8,6);
		
		Optional<Integer> option5 = list.stream().filter(data -> data > 5).findAny();
		option5.ifPresent(System.out::println);
		
		Optional<Integer> optionNotFound = list.stream().filter(data -> data > 100).findAny();
		optionNotFound.ifPresent(System.out::println);
		
		// will throw the erro because element is not exist
		// optionNotFound.get();
		
		System.out.println(optionNotFound.orElse(5));
		
		System.out.println(optionNotFound.orElseGet(() -> 8));
		
		// static value
		Optional<String> opt = Optional.of("static value");
		System.out.println(opt.get());
		
		// empty value
		Optional<Integer> opt1 = Optional.empty();
		System.out.println("isPresent = "+opt1.isPresent());
	}
}
