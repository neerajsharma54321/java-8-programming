import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Immutable {
	
	private final Integer id;
	
	
	public Immutable(Integer id) {
		this.id = id;
	}
	
	public static void main(String ...s) {
		Map<String, String> map = new HashMap<>();
		map.put("a", "Aa");
		map.put("b", "Bb");
		map.put("c", "Cc");
		map.put("d", "Dd");
		
		
		Set<String> set = map.keySet();
		
		Iterator<String> i = set.iterator();
		
		while(i.hasNext()) {
			System.out.println(map.get(i.next()));
		}
		
	}
	
}
