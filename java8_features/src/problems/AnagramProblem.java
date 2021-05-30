package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramProblem {

	public static void main(String[] args) {
//		 Scanner scan = new Scanner(System.in);
//	        String a = scan.next();
//	        String b = scan.next();
//	        scan.close();
		
		String a = "abcdfd", b = "cdfasd";
		boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		
		String c = "listen", d = "silent";
	    System.out.println( isAnagram(c, d) ? "Anagrams" : "Not Anagrams" );
	}
	
	private static boolean isAnagram(String a, String b) {
		if(a.length() != b.length()) return false;
	
		Map<Character, Integer> aMap = new TreeMap<Character, Integer>();
		Map<Character, Integer> bMap = new TreeMap<Character, Integer>();
		
		for(int i=0; i<a.length(); i++) {
			
			final char aKey = Character.toUpperCase(a.charAt(i));
			final char bKey = Character.toUpperCase(b.charAt(i));
			
			if(aMap.containsKey(aKey)) {
				aMap.replace((aKey), aMap.get(aKey)+1 );
			} else {
				aMap.put((aKey), 1 );
			}
			
			if(bMap.containsKey(bKey)) {
				bMap.replace((bKey), bMap.get(bKey)+1 );
			} else {
				bMap.put((bKey), 1 );
			}
		}
		
		System.out.println("aMap = "+aMap+",\n bMap ="+bMap);
		return aMap.equals(bMap);
	} 

}
