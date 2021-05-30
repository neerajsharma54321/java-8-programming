package collection_util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapToLong {

	public static void main(String[] args) {
		 System.out.println("The stream after applying "
                 + "the function is : "); 

 // Creating a list of Strings 
		 System.out.println(Double.doubleToRawLongBits(1));
		 List<String> list = Arrays.asList("25", "225", "1000", 
                                           "20", "15"); 
		 List<Long> lList = list.stream().mapToLong(num -> Long.parseLong(num)).boxed().collect(Collectors.toList());
		 System.out.println(lList);
		 
		 
	}

}
