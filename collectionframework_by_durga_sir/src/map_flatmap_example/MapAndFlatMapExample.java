package map_flatmap_example;

import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapAndFlatMapExample {

	public static void main(String[] args) {
		String [] oneDArray = new String[] {"1", "a", "b", "c"};
		Stream<String> oneDStream = Arrays.stream(oneDArray);

		// here we have 1 d array and we don't need flatmap here. 
		oneDStream.forEach(i -> System.out.print(" "+i));
		
		System.out.println("\n flatmap example.");
		String [][] twoDArray = new String[][] {{"a","b", "cd"}, {"de", "fgh", "jkl"}, {"lmn", "abc", "cd"}};
		Stream<String> fTwoDArray = Arrays.stream(twoDArray).flatMap(f -> Arrays.stream(f)).distinct();
		fTwoDArray.forEach(d -> System.out.print(" "+d));
		
		// for primitive type we can use flatMap method such as flatMapToInt 
		System.out.println("int array example.");
		int [] pInt= {2,4,5,6,9,8,5,6,2,3,4,7,8,5,9,6};
		// Arrays.stream(pInt).boxed().collect(Collectors.toList());
		Stream<int[]> streamPInt = Stream.of(pInt);
		IntStream intStream = streamPInt.flatMapToInt(d -> Arrays.stream(d));
		PrimitiveIterator.OfInt intIter = intStream.iterator();
		while(intIter.hasNext()) System.out.print(" "+intIter.next());
	}

}
