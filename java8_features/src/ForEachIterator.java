import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ForEachIterator {
	public static void main(String ...s) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(9);
		list.add(5);
		
		Consumer<Integer> consumer = (Integer i) ->{
			System.out.println("value of i ="+i);
		};
		
		Comparator<Integer> comparable = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		};
		
		list.forEach(consumer);
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		System.out.println(list.stream().sorted(comparable));
		// System.out.println(list.stream().sorted(Collectors));
	}
}
