package list_interface_basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;;

public class ListBasic {
	public static void main(String ...s) {
		List<Integer> list = new ArrayList<>();
		
		/* index is the major role in List interface
		========================================================
	    |	4|	5 |	6 | 8 | 9 |	5 | 8 |	11 | 12	| 15 | 17 |	15 |
	    ========================================================
	    */
		
		Integer [] i = {4,5,6,8,9,5,8,11,12,15,17,15};
		list = Arrays.asList(i);
		
		System.out.println("list is "+ list);
		
		// list.add(new Integer(5));
		System.out.println(list.indexOf(4));
		
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(5);
		System.out.println("list is "+ l1);
		
		System.out.println("list obj are"+ list);
		
	}
}
