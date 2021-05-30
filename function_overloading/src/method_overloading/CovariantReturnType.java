package method_overloading;

public class CovariantReturnType {
	
	public int add(long a, long b) {
		System.out.println("inside long param");
		return (int)(a+b);
	}
	
	public int add(int a, int b) {
		System.out.println("inside int param");
		return a+b;
	}
	
	public byte add(byte a, byte b) {
		System.out.println("inside byte param");
		return (byte) (a+b);
	}
	
	public short add(short a, short b) {
		System.out.println("inside short method");
		return (short) (a+b);
	}
	

	public static void main(String[] args) {
		CovariantReturnType c = new CovariantReturnType();
		byte a= 127, b = 2;
		
		short s1 = (short)158; short s2 = (short)789;
		System.out.println("s1"+s1+", s2 = "+s2);
		System.out.println(c.add(s1, s2));
		System.out.println(c.add(a,b));
		System.out.println(c.add(4l, 5l));
		System.out.println(c.add(4, 5));
	}

}
