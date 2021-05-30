package comparable;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemoTreeSet {
	public static void main(String ...s) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>(new MyComparableAsc()); // It will use the default natural sorting.
		treeSet.add(3);
		treeSet.add(1);
		treeSet.add(1);
		treeSet.add(2);
		
		System.out.println(treeSet); // expected output [1,2,3]
		
		TreeSet<Integer> treeSet2 = new TreeSet<Integer>(new MyComparableDesc()); // It will use the default natural sorting.
		treeSet2.add(3);
		treeSet2.add(1);
		treeSet2.add(1);
		treeSet2.add(2);
		
		System.out.println(treeSet2); // expected output [3,2,1]
		
		TreeSet<Integer> treeSet3 = new TreeSet<Integer>(new MyComparableShortCodeAsc()); // It will use the default natural sorting.
		treeSet3.add(3);
		treeSet3.add(1);
		treeSet3.add(1);
		treeSet3.add(2);
		
		System.out.println(treeSet3); // expected output [1,2,3]
		
		TreeSet<Integer> treeSet4 = new TreeSet<Integer>(new MyComparableShortCodeDesc()); // It will use the default natural sorting.
		treeSet4.add(3);
		treeSet4.add(1);
		treeSet4.add(1);
		treeSet4.add(2);
		
		System.out.println(treeSet4); // expected output [3,2,1]
		
		
		TreeSet<Integer> treeSet5 = new TreeSet<Integer>(new InsertionOrderComparator()); // It will use the default natural sorting.
		treeSet5.add(3);
		treeSet5.add(1);
		treeSet5.add(1);
		treeSet5.add(2);
		
		System.out.println(treeSet5); // expected output [3,1,1,2]
		
		TreeSet<Integer> treeSet6 = new TreeSet<Integer>(new InsertionOrderReverseComparator()); // It will use the default natural sorting.
		treeSet6.add(3);
		treeSet6.add(1);
		treeSet6.add(1);
		treeSet6.add(2);
		System.out.println(treeSet6); // expected output [2,1,1,3]
		
		
		TreeSet<Integer> treeSet7 = new TreeSet<Integer>(new OverwriteDataComparator()); // It will use the default natural sorting.
		treeSet7.add(3);
		treeSet7.add(5);
		treeSet7.add(1);
		treeSet7.add(1);
		treeSet7.add(2);
		System.out.println(treeSet7); // expected output [2]
		
		
	}
}

class MyComparableAsc implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 > o2) return 1;
		else if(o1 < o2) return -1;
		return 0;
	}
}

class MyComparableDesc implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 > o2) return -1;
		else if(o1 < o2) return 1;
		return 0;
	}
}

class MyComparableShortCodeAsc implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
}

class MyComparableShortCodeDesc implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1); // -o1.compareTo(o2);
	}
}

class InsertionOrderComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return 1;
	}
}


class InsertionOrderReverseComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return -1;
	}
}

class OverwriteDataComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return 0;
	}
}
