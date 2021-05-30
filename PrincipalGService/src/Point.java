
public class Point {

	public static void main(String[] args) {
		int x = 0, y =0;
		
		String s = "BFRLRLLLLRFFRBF";
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'B') x -=1;
			if(s.charAt(i) == 'F') x +=1;
			if(s.charAt(i) == 'L') y +=1;
			if(s.charAt(i) == 'R') y -=1;
		}
		
		System.out.println("{ x = "+x+", y = "+y+"}");
	}
}
