package map.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


class Node {
	Node next;
}
public class MapWithKeyExample {
	public static void main(String ...s) {
		List<Individuals> list = new ArrayList<Individuals>();
		
		list.add(new Individuals(1, 2000, 2017));
		list.add(new Individuals(1, 3000, 2018));
		list.add(new Individuals(1, 5000, 2019));
		
		list.add(new Individuals(2, 2000, 2017));
		list.add(new Individuals(2, 3000, 2018));
		list.add(new Individuals(2, 5000, 2019));
		
		list.add(new Individuals(3, 2000, 2017));
		list.add(new Individuals(3, 3000, 2018));
		list.add(new Individuals(3, 5000, 2019));
		
		Map<Integer, LinkedList<Individuals>> map = new HashMap<Integer, LinkedList<Individuals>>();
		
		for(Individuals i: list) {
			if(map.containsKey(i.id)) {
				LinkedList<Individuals> lList = map.get(i.id);
				lList.add(i);
				map.replace(i.id, lList);
			}else {
				LinkedList<Individuals> l = new LinkedList<>();
				l.add(i);
				map.put(i.id, l);
			}
		}
		
		System.out.println(map.get(2));
	}
}

class Individuals{
	int id;
	int salary;
	int year;
	
	public Individuals(int id, int salary, int year) {
		super();
		this.id = id;
		this.salary = salary;
		this.year = year;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", salary=" + salary + ", year=" + year + "]\n";
	}
}
