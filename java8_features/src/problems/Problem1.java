package problems;

import java.util.Arrays;
import java.util.stream.Collectors;


/**
 * Write the program to sort the numbers
 * */
public class Problem1 {
	public static void main(String ...s) {
		Integer a[] = {2,5,6,9,8,7,4,3,0};
		
		Arrays.asList(a).stream()
		.sorted().collect(Collectors.toList())
		.forEach(data -> System.out.print(data));
		
	
	}
}


