For empty TreeSet null insertion is allowed.


but after the insertion of null insertion and If we try to add the other new elements then we will get 
NullPointerException.

i.e. Null insertion only allowed at first time or as first element.

Example:

class TreeSetDemo {
	public static void main(String ...s) {
		TreeSet ts = new TreeSet();
		ts.add(null); // it will work.
		ts.add("A"); // Null pointer exception
		
	}
}

# In treeset we can only add homogeneous and comparable object.


// it will work because the objects we are adding in treeset are homogeneous and Comparable. String implments Comparable Interface.
TreeSet t =new treeSet();
t.add("a");
t.add("b");


// It will throw error because StringBuffer doesn't implments Comparable interface.
TreeSet t = new TreeSet();
t.add(new StringBuffer("a"));
t.add(new StringBugger("b"));


