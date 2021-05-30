import java.util.HashMap;
import java.util.Map;

public class CountCharacterFrequency {
	public static void main(String...s) {
		CountCharacterFrequency ccf = new CountCharacterFrequency();
		ccf.countCharFrequency();
	}
	
	private Map<Character, Integer> countCharFrequency() {
		String a = new String("neerajsharma");
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<a.length(); i++) {
			int count = 1; boolean isKeyAvailable = false;
			innerLoop:
			for(int j=i+1; j<a.length(); j++) {
				if(map.containsKey(a.charAt(i)))
					{
						isKeyAvailable = true;
						break innerLoop;
					}
				if(a.charAt(i) == a.charAt(j)) 
					count++;
			}
			if(!isKeyAvailable)
			map.put(a.charAt(i), count);
		}
		System.out.println("Daru badnam karti"+map);
		return null;
	}
}
