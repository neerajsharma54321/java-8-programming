
public class NumberCon {
	public static void main(String ...s) {
		System.out.println(newNumber(123));
		System.out.println(newNumber(01234567));
		System.out.println(newNumber(25647));
		
	}
	
	public static int newNumber(int num) {
		char ch[] = String.valueOf(num).toCharArray();
		String data = "";
		for(char c: ch) {
			data += (9 - Character.getNumericValue(c));
		}
		return Integer.parseInt(data);
	}
}
