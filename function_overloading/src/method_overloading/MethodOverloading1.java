package method_overloading;

public class MethodOverloading1 {

	public static void main(String[] args) {
		DisplayNumber displayNumber = new DisplayNumber();
		
		displayNumber.displayNumb(50);
		displayNumber.displayNumb(new Integer(50));
		
		displayNumber.add(25, 25);
		displayNumber.add(new Integer(25), new Integer(25));
		//	The below statement is ambiguous
		// displayNumber.add(new Integer(25), 25);
	}
}

 
class DisplayNumber{
	
	public void displayNumb(int a) {
		System.out.println("primitive int number is= "+a);
	}
	
	public void displayNumb(Integer a) {
		System.out.println("Wrapper class Integer number is ="+a);
	}
	
//	public int add(int a, int b) {
//		System.out.println("primitive add = "+(a+b));
//		return a+b;
//	}
//	
	public Integer add(Integer a, Integer b) {
		System.out.println("Wrapper int add = "+(a+b));
		return a+b;
	}
	
	public double add(double a, double b) {
		System.out.println("double = "+(a+b));
		return a+b;
	}
}
