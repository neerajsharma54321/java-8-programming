package problemWithJava8Solution;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.LinkedHashMap;

// "apple", "apple", "banana",
// "apple", "orange", "banana", "papaya"

public class CountItem {
	public static void main(String ...s) {
		 //3 apple, 2 banana, others 1
        List<String> items =
                Arrays.asList("apple", "apple", "banana", "papaya",
                        "apple", "orange", "banana", "orange", "orange", "orange");
        
      Map<String, Long> m = items.stream().collect(
        		Collectors.groupingBy(Function.identity(), Collectors.counting())
        		);
      System.out.println(m);
      
//      Set<Entry<String, Long>> eSet = m.entrySet();
//      for(Entry<String, Long> e: eSet) {
//    	  System.out.println("key ="+e.getKey()+", value ="+e.getValue());
//      }
      
      Map<String, Long> finalMap = new LinkedHashMap<>();
      // sort the data on the basis of key
       m.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByKey()).forEach(e -> {
    	   finalMap.put(e.getKey(), e.getValue());
       });
       System.out.println(finalMap);
       
       // descending order
       Map<String, Long> otherMap = new LinkedHashMap<>();
       m.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByKey().reversed()).forEach(e -> {
    	   otherMap.put(e.getKey(), e.getValue());
       });
       System.out.println(otherMap);
       
       // sort by value (asc and desc)
       Map<String, Long> valueMapAsc = new LinkedHashMap<>();
       // sort the data on the basis of key
        m.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue()).forEach(e -> {
        	valueMapAsc.put(e.getKey(), e.getValue());
        });
        System.out.println(valueMapAsc);
        
        // descending order
        Map<String, Long> valueMapDesc = new LinkedHashMap<>();
        m.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEach(e -> {
        	valueMapDesc.put(e.getKey(), e.getValue());
        });
        System.out.println(valueMapDesc);
       
       
       
//       .forEach(data -> {
//    	   System.out.println("key ="+data.getKey()+", value = "+data.getValue());
//       }); 
	}
}
