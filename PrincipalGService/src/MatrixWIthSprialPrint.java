
public class MatrixWIthSprialPrint {

	public static void main(String[] args) {
		int mat[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}};
		
		
	}
	
	public static String sprialPrint(int [][]s) {
		for(int i=0; i<s.length; i++) {
			
			for(int j=0; j<s[i].length; j++) {
				
				System.out.println(s[i][j]);
				
			}
		}
		return null;
	}

}
