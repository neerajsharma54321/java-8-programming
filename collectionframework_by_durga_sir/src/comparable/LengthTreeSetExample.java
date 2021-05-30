package comparable;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * Create a program which return the output according to the length of character.
 * 
 * Example: string are added in the below order.
 * 
 * Z, A, B , AB, CDD, K , MNOP, KM, ABC
 * 
 * EXPECTED OUTPUT: A, B, K, Z, AB, KM, ABC, CDD, MNOP
 * 
 * 
 * NOTE: please note, here we are adding heterogeneous object in the TreeSet and objects are not implemented 
 * comparable interface. So, From the below example, Please note that, If we are using comparator in the constructor
 * then we can add heterogeneous and non comparable object.
 */
public class LengthTreeSetExample {
	public static void main(String ...s) {
		TreeSet t = new TreeSet<String>(new MyComparator());
		t.add("Z");
		t.add(new StringBuffer("A"));
		t.add("B");
		t.add("AB");
		t.add("CDD");
		t.add("K");
		t.add("MNOP");
		t.add("KM");
		t.add("ABC");
		System.out.println(t);
	}
}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		if(s1.length() > s2.length()) return 1;
		else if(s2.length() > s1.length()) return -1;
		else return s1.compareTo(s2);
	}
	
	
}
