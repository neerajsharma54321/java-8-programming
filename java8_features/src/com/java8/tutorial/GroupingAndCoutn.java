package com.java8.tutorial;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingAndCoutn {
	public static void main(String ...s) {
		// get of developer list using name it count
		
		List<Developer> devList = Developer.getDeveloperList();
		Map<String, Long> devGroupNameAndCount =  devList.stream().map(dev -> dev.getName())
						.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
		System.out.println(devGroupNameAndCount);
		
		// summing the experience of same employee name
		Map<String, Double> devSumexpUsingName = 
				devList.stream()
				.collect(
						Collectors.groupingBy(Developer::getName,
						Collectors.summingDouble(Developer:: getExperience)));
		System.out.println(devSumexpUsingName);
	}
}
