package method_overloading;

public class MethodOverloadingWideningAndBoxingTogether {
	
	public void show(Integer i) {
			System.out.println("widening with boxing for Wrappter Integer ="+ i);
	}
	
	public static void main(String ...s) {
		MethodOverloadingWideningAndBoxingTogether m = new MethodOverloadingWideningAndBoxingTogether();
		byte b = 5;
		
		// widening and boxing both are not applicable together 
		// m.show(b);
	}
}
