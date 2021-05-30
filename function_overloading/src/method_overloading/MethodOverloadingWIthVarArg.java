package method_overloading;

// Widening of primitive type gets more priority over var-args. 
public class MethodOverloadingWIthVarArg {

	public void show(long ...s) {
		System.out.println("long var args");
		for(byte i=0; i<s.length; i++) {
			System.out.print(s[i]+"\t");
		}
	}
	
	public void show(long a, long b) {
		System.out.println("primitive type long a= "+ a+", b="+b);
	}
	
	public static void main(String[] args) {
		MethodOverloadingWIthVarArg m = new MethodOverloadingWIthVarArg();
		
		m.show(5, 50);
		m.show(5, 5, 50);
	}
	
	

}
