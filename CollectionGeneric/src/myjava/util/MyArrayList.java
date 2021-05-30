package myjava.util;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class MyArrayList<T> implements MyList<T> {
	private final int DEFAULT_SIZE = 5;
	private static int index = 0;
	private Object arrayListObject[] = new Object[DEFAULT_SIZE];
	
	@Override
	public void add(T t) {
		if(arrayListObject.length%DEFAULT_SIZE == 0 && index!=0) increaseArrayLenght(DEFAULT_SIZE);
		arrayListObject[index] = t;
		index +=1;
	}
	
	private void increaseArrayLenght(int increaseBy) {
		Object newTempArray[] = new Object[this.arrayListObject.length + increaseBy];
		for(int i=0;i<this.arrayListObject.length; i++) {
			newTempArray[i] = this.arrayListObject[i];
		}
		this.arrayListObject = newTempArray;
	}
	
	@Override
	public int size() {
		return index;
	}
	
	@Override
	public T get(int index) {
		if(index<=0 || index>this.index) throw new ArrayIndexOutOfBoundsException();
		return (T)this.arrayListObject[index-1];
	}
	
	@Override
	public void addAll(MyList<T> list) {
		this.increaseArrayLenght(list.size());
		System.out.println(list+" "+list.size());
		for(int i= 0; i<list.size(); i++) {
			this.arrayListObject[index] = list.get(i+1);
			index +=1;
		}
	}

	@Override
	public String toString() {
		String dataResult = "[";
		Object object [] = new Object[index];
		for(int i=0; i<index; i++) {
			dataResult += this.arrayListObject[i] + ",";
		}
		return dataResult += "]";
		
	}

	@Override
	public Iterator<T> iterator() {
		return new Itr<>();
	}
	
	private class Itr<T> implements Iterator<T> {
		
		private int cursor;
		private int lastRef = -1;
		private int exptectedModCount = MyArrayList.this.size();
		
		@Override
		public boolean hasNext() {
			return cursor != index;
		}

		
		@Override
		@SuppressWarnings("unchecked")
		public T next() {
			int i = cursor;
			checkForModification();
			if(i >= index)
				throw new NoSuchElementException();
			Object [] elObjects = MyArrayList.this.arrayListObject;
			if(i >= elObjects.length)
				throw new ConcurrentModificationException();
			
			cursor = i + 1;
			return (T)elObjects[lastRef = i];
		}
		
		final private void checkForModification() {
			if(exptectedModCount != index)
				throw new ConcurrentModificationException();
		}
	}

	
	
}
