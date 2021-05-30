package comparable;

import java.util.TreeSet;

public class ComparableWithTreeSet {
	public static void main(String ...s) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>(); // It will use the default natural sorting.
		treeSet.add(3);
		treeSet.add(1);
		treeSet.add(2);
		
		System.out.println(treeSet); // expected output [1,2,3]
	}
}
