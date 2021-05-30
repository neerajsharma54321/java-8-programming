package com.java8.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
	public static void main(String ...s) {
		String str = "bbcaaadddeaf";
		
		List<Character> list = new ArrayList<Character>();
		for(Character ch: str.toCharArray())
			list.add(ch);
		
		Map<Character, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
		Map<String, Integer> unsortMap = new HashMap<String, Integer>();
		 	unsortMap.put("z", 10);
	        unsortMap.put("b", 5);
	        unsortMap.put("a", 6);
	        unsortMap.put("c", 20);
	        unsortMap.put("d", 1);
	        unsortMap.put("e", 7);
	        unsortMap.put("y", 8);
	        unsortMap.put("n", 99);
	        unsortMap.put("g", 50);
	        unsortMap.put("m", 2);
	        unsortMap.put("f", 9);

	        System.out.println("Original...");
	        System.out.println(unsortMap);
	        
	        
	   /*     Map<String, Integer> result1 = unsortMap.entrySet().stream()
	                .sorted(Map.Entry.comparingByKey())
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
	        System.out.println(result1);*/

	        
	        Map<String, Integer> result = unsortMap.entrySet().stream()
	        		.sorted(Map.Entry.comparingByKey())
	        		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	        		(oldKey, oldValue) -> oldKey, LinkedHashMap::new));
	        System.out.println(result);

	        
	        // sort by values
	        
	        Map<String, Integer> unsortMap2 = new HashMap<>();
	        unsortMap2.put("z", 10);
	        unsortMap2.put("b", 5);
	        unsortMap2.put("a", 6);
	        unsortMap2.put("c", 20);
	        unsortMap2.put("d", 1);
	        unsortMap2.put("e", 7);
	        unsortMap2.put("y", 8);
	        unsortMap2.put("n", 99);
	        unsortMap2.put("g", 50);
	        unsortMap2.put("m", 2);
	        unsortMap2.put("f", 9);
	        
	        unsortMap2.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
	        	.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	        			 (oldValue, newValue) -> oldValue, LinkedHashMap::new));
	        
	        Map<String, Integer> mapo = new LinkedHashMap<String, Integer>();
			unsortMap2.entrySet().stream()
	        	.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
	        	// .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//	        	.collect(Collectors.toMap(Map.Entry<String,Integer>::getKey, Map.Entry<String,Integer>::getValue), 
//	        			(old, newV)-> old, mapo.put(old, newV));
	        	.forEachOrdered(d -> mapo.put(d.getKey(), d.getValue()));
	        	

		
	}
}
