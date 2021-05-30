package consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Consumer1 {
	public static void main(String ...s) {
		
		Integer arr [] = {2, 5, 2, 6, 3, 5, 9};
		List<Integer> myList = Arrays.asList(arr);
		
		MyPredicate myPredicate = new MyPredicate();
	myList.stream().filter(myPredicate).collect(Collectors.toList()).
				forEach(data -> System.out.print(data+"\t"));
		
		System.out.println("----------------other predicate example.--------------");
		Predicate<Integer> otherPredicate = (i)->{
			return i%2 == 0 ? true : false;
		};
		
		myList.stream().filter(otherPredicate).forEach(data -> System.out.print(data+"\t"));
	}
}


class MyPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if(t > 5) return true;
		else return false;
	}
	
}
