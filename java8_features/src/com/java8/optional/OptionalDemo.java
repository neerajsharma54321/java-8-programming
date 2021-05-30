package com.java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<String> opt = Optional.of("Neeraj");
		
		String newString = opt.orElse("khus to bahut hoge, Memory jo mil gai.");
		System.out.println(newString);
		
		System.out.println(show());
		
		Optional<Integer> intOpt = Optional.of(40);
		
		System.out.println(intOpt.filter(data -> data > 45).isPresent());
		
		System.out.println(intOpt.filter(data -> data > 35).isPresent());
		
		System.out.println(intOpt.filter(data -> data == 40).isPresent());
		
		String s[] = new String[10];
		
		Optional<String> o = Optional.<String>ofNullable(s[2]);
		if(o.isPresent()) {
			System.out.println("Yes. I'm exist.");
		}else {
			System.out.println("I am not exist. Because, You are trying to access null values.");
		}
	}
	
	public static String show() {
		List<String> list = Arrays.asList("am","b");
		
		 System.out.println(list.stream().filter(a -> a.length()==5).findAny().orElseGet(() -> {
			 	String hello = "hello in the world of java. ";
			 	String tum = "tum jada tej mat bano.";
			 return hello+tum;
		 }));
		
		return list.stream().filter(a -> a.length()==2).findAny().orElse("Neeraj Sharma");
	}
}
