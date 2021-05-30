package basicExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringExampleWithAssert {
	public static void main(String ...s) {
		List<String> list = new ArrayList<String>();
		list.add("Neeraj ");
		list.add("Sharmajjs");
		String finalWord = list.get(0)+list.get(1);
		assert finalWord.equals("Neeraj Sharma ");
		System.out.println("the word is "+finalWord);
		
		List<Integer> intList = Arrays.asList(2,3,5,1);
		int num = 0;
		
		for(final int n : intList) {
			num +=n;
		}
		assert num == 21;
	}
}
