package collection_util.intstream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class IntStreamExample {

	public static void main(String[] args) {
		IntStream i = IntStream.of(2,5,3,6,9,8,7);
		
		i.forEach(System.out::println);

		// parallel
		IntStream i1 = IntStream.range(4, 10);
		i1.parallel().forEach(ndat -> System.out.print(ndat+"\t"));
		IntStream.range(4, 10).parallel().forEachOrdered(ndat -> System.out.print(ndat+"\t"));
		
		
		// map to object
		System.out.println("map to object example.");
		List<Long> l = IntStream.range(4, 10).parallel().mapToObj(ndat -> Long.valueOf(ndat)).collect(Collectors.toList());
		System.out.println(l);
		
		// Creating an IntStream 
        IntStream stream = IntStream.range(3, 8); 
  
        Stream<String> stream1 = stream.mapToObj(num -> Integer.toBinaryString(num)); 
        stream1.forEach(System.out::println); 
        
        // iterator
         PrimitiveIterator.OfInt iteraotr =  IntStream.of(4,2,5,6,3,8,9).iterator();
         while(iteraotr.hasNext()) System.out.print(iteraotr.nextInt()+" ");
         
         System.out.println("\ndoubleStream example.");
         PrimitiveIterator.OfDouble it2 =  DoubleStream.of(4,2.6,5,6,3,8,9).iterator();
         while(it2.hasNext()) System.out.print(it2.nextDouble()+" ");
         
         System.out.println("\nlong stream example");
         PrimitiveIterator.OfLong it3 = LongStream.of(1l, 2l, 3l, 4444444444444444444l).iterator();
         while(it3.hasNext()) System.out.print(it3.nextLong()+" ");
         
         // generate random number in intstream
         IntStream i1s = IntStream.generate(() -> {
        	 return (int)(Math.random() * 4896575236l);
         }).limit(5);
         i1s.forEach(num -> System.out.print(" "+num));
         
         // sorting
         IntStream unsortedStream = IntStream.generate(() -> {
        	 return (int)(Math.random() * 4896575236l);
         }).limit(5);
         System.out.println("element after sorting...");
         unsortedStream.sorted().forEach(num -> System.out.print(" "+num));
         
         IntStream is = IntStream.generate(() -> (int)(Math.random() * 100)).skip(2).limit(7);
         IntSummaryStatistics iss = is.summaryStatistics();
         System.out.println("\n statistics ="+iss);
         
         // intstream concate
         IntStream iStream1 = IntStream.of(1,2,3,6,5,7);
         IntStream iStream2 = IntStream.of(2,8,5,6,9,64,8,7);
         
         System.out.println("int stream concateion.");
         IntStream.concat(iStream1, iStream2).forEach(cI -> System.out.print(" "+cI));
         
	}

}
