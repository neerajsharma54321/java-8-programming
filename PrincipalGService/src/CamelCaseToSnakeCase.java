
public class CamelCaseToSnakeCase {
	public static void main(String ...str) {
		String sc = "hello_in_the_world_of_java";
		String cc = "helloInTheWorldOfJava";
		
		String regex = "([a-z])([A-Z]+)";
		String replacement = "$1_$2";
		
		System.out.println(cc.replaceAll(regex, replacement).toLowerCase());
		
		 StringBuffer sb = new StringBuffer();
	      for (String s : sc.split("_")) {
	         sb.append(Character.toUpperCase(s.charAt(0)));
	         if (s.length() > 1) {
	            sb.append(s.substring(1, s.length()).toLowerCase());
	         }
	      }
	      System.out.println(sb);
	}
}
