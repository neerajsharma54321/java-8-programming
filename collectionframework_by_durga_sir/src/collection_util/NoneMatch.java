package collection_util;

import java.util.ArrayList;
import java.util.List;

public class NoneMatch {
	public static void main(String ...s) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(6);
//		list.add(8);
		list.add(9);
		
		System.out.println(list.stream().noneMatch(num -> num>9));
	}
}
