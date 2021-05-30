package collection_util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionReverse {
	public static void main(String ...s) {
		List<Integer> list = new ArrayList();
		list.add(50);
		list.add(4);
		list.add(8);
		list.add(7);
		list.add(61);
		System.out.println(list);
		
		// rotate
		System.out.println("rotate");
		Collections.rotate(list, 2);
		System.out.println(list);
		
		System.out.println("reverse...!");
		Collections.reverse(list);
		System.out.println(list);
	}
}
