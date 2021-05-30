package stringdemo;

/**
 * This class will perform the sample operation for string.
 * 
 * <p>
 * Please not String class is immutable therefore in the below example the output is Hello (value of str)
 * <blockquote>
 * <pre> String str = new String("Hello");
 * str.append(" World");
 * </pre>
 * </blockquote>
 * The output of the above code is {@code "Hello"}.
 * 
 * StringBuffer: class is mutable class therefore the content can be modify.
 * </p>
 * 
 * */
public class StringAndStringBuffer {
	public static void main(String ...s) {
		String str = new String("Hello");
		String newString = str.concat(" world");
		
		System.out.println("str is ="+str);
		// expected output is "str is = Hello";
		
		System.out.println("newString is ="+newString);
		
		StringBuffer sb = new StringBuffer("My ");
		sb.append("World");
		
		System.out.println("sb is = "+sb); // My World
		
		String s1 = "hello"; String s2 = new String("hello");
		String s3 = "hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
	}
}
