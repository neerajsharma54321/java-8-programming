package myjava.util;

public interface Collection<T> extends Iterable<T> {

	public void add(T t);
	public int size();
	public T get(int index);
	public void addAll(MyList<T> list);
	
}
