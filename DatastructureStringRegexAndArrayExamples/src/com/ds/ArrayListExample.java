package com.ds;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * 
 * Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"


 * *
 */

public class ArrayListExample {
	public static void main(String[] args) {
        try{
        	Scanner scanner = new Scanner(System.in);
        	
        	System.out.println("Number of inputs");
        	Integer line = Integer.parseInt(scanner.nextLine());
        	
        	List<List<Integer>> inputs = new ArrayList<List<Integer>>();
        	List<List<Integer>> queryInputs = new ArrayList<List<Integer>>();
        	
        	for(int i=0; i<line; i++) {
        		System.out.println("enter line values seperated by space");
        		String str = scanner.nextLine();
        		// scanner.nextLine(); 
        		String a[] = str.split("\\s");
        		List<Integer> lineInputs = new ArrayList<Integer>();
        		for(int j=0; j<a.length; j++) {
        			lineInputs.add(Integer.valueOf(a[j]));
        		}
        		inputs.add(lineInputs);
        	}
        	
        	System.out.println("number of queries ?");
        	Integer queries = Integer.parseInt(scanner.nextLine());
        	
        	for(int i=0; i<queries; i++) {
        		System.out.println("enter query arraylist index with position such as 2 array position 3");
        		String str = scanner.nextLine();
        		String a[] = str.split("\\s");
        		List<Integer> queryInput = new ArrayList<Integer>();
        		for(int j=0; j<a.length; j++) {
        			queryInput.add(Integer.valueOf(a[j]));
        		}
        		queryInputs.add(queryInput);
        	}
        	
        	queryInputs.forEach(data -> {
        		try {
        			System.out.println((inputs.get(data.get(0) - 1)).get(data.get(1) - 1));
        		}catch(Exception ex) {
        			System.err.println("ERROR!");
        		}
        	}); 	
        	
        }catch(Exception ex){
        	System.err.println("exception"+ex);
        }
    }
}
