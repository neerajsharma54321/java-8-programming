package collection_base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionBasicOperation {
	public static void main(String ...s) {
		Collection<String> c = new ArrayList<String>();
		
		c.add("A");
		c.add("B");
		
		Collection <String>anotherCollection = new ArrayList<String>();
		anotherCollection.add("A");
		anotherCollection.add("D");
		
		c.addAll(anotherCollection);
		System.out.println(c); // expected o/p A,B,A,D
		
		c.remove("A");
		System.out.println(c); // expected o/p B,A,D
		
		c.removeAll(anotherCollection);
		System.out.println(c); // expected o/p B
		
		
		c.clear();// remove all the elements from the collections
		System.out.println(c); // empty collection
		
		c.add("A");
		c.add("D");
		
		Collection<String> retainCollectionClass = new ArrayList<String>();
		retainCollectionClass.add("D");
		
		c.retainAll(retainCollectionClass); // remove all the elements from the collections except retainCollectionClass
		System.out.println(c); // expected o/p D
		
		System.out.println("is c collection empty ="+c.isEmpty()); // to check is collection empty

		System.out.println(c.size()); // to check the size of the collection
		
		System.out.println(c.contains("A")); //check whether the object present in the collections or not
		
		
		System.out.println(c.containsAll(anotherCollection)); // is all the collection available in another collection or not
		
		c.add("A");
		c.add("B");
		c.add("C");
		
		Object[] stringToArr = c.toArray(); // to convert a collection to Array
		
		Iterator<String> iterator = c.iterator(); // to retrieve the elements
		
		System.out.println("to arr"+ stringToArr);
		System.out.println("c"+c);
		
		// Please notice that, Collection class doesn't contains any method to retrieve the Object, there
		// is no concrete class which implements collection class directly.
	}
}
