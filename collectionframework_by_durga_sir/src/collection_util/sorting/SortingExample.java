package collection_util.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class SortingExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(4);
		list.add(1);
		list.add(7);
		list.add(8);
		list.add(78);
		list.add(9);
		
		System.out.println("unsorted data.");
		System.out.println(list);
		
		list.stream().sorted(Comparator.naturalOrder()).forEach(num -> System.out.print(" "+num));
		
		Integer ar [] = {1,5,3,6,8,9,5,42,4,89,2,1,46};
		List<Integer> l = Arrays.asList(ar);
		System.out.println("\n"+l);
		
		l.stream()
			.mapToInt(s -> new Integer(s).intValue())
			.skip(2)
			.forEach(data -> System.out.print(" "+data));
		
		System.out.println("\nflatmap example.");
		IntStream is = l.stream().flatMapToInt(d -> IntStream.of(d));
		is.forEach(d -> System.out.print(" "+d));
	
	}

}
