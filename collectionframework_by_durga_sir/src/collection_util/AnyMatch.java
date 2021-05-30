package collection_util;

import java.util.ArrayList;
import java.util.List;

public class AnyMatch {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(6);
		list.add(8);
		list.add(6);
		list.add(2);
		list.add(1);
		list.add(90);
		
		System.out.println(list.stream().anyMatch(num -> num >10));

		// ordered foreach
	    list.stream().forEachOrdered(num -> System.out.print(num +"\t"));
	    System.out.println();
	    // foreach unordered
	    list.parallelStream().forEach(num -> System.out.print(num +"\t"));
	    System.out.println();
	    list.parallelStream().forEachOrdered(num -> System.out.print(num +"\t"));
	    
	}

}
