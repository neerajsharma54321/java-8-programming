package trickyquestion;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		foo(null);
		
		Double d = 8.00000;
		Float f =  8.00000f;
		System.out.println(d);
		System.out.println(f);
		System.out.println(d.equals(f));
		
		long longWithL = 1000*60*60*24*365L;
		long longWithoutL = 1000*60*60*24*365;
		System.out.println(longWithL);
		System.out.println(longWithoutL);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		List<Integer> list = new ArrayList();
		// list.add("Neeraj");
		
		System.out.println(list);
	}
	
	public static void foo(Object o) {
		System.out.println("Object impl");
	}
	public static void foo(String s) {
		System.out.println("String impl");
	}
}