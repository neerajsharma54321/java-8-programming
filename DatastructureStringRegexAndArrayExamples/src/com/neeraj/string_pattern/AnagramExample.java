package com.neeraj.string_pattern;

import java.util.Arrays;

public class AnagramExample {

	
	
	public static void main(String[] args) {
		 isAnagram("Keep", "Peek");  
	     isAnagram("Mother In Law", "Hitler Woman");  
	}
	
	static boolean isAnagram(String s1, String s2) {
		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");
		
		boolean status = true;
		
		if(str1.length() != str2.length())
			status = false;
		else {
			char c1[] = str1.toLowerCase().toCharArray();
			char c2[] = str2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			status = Arrays.equals(c1, c2);
		}
		  if (status) {  
	            System.out.println(s1 + " and " + s2 + " are anagrams");  
	        } else {  
	            System.out.println(s1 + " and " + s2 + " are not anagrams");  
	        }  
		return status;
	}

}
