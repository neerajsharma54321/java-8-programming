
public class Staircase {
	
    // Complete the staircase function below.
	    static void staircase(int n) {
	        for(int i=0; i<n; i++) {
	            int spaceC = n - i - 1;
	            int hashC = i;
	            
	            for(int j = 0; j<=spaceC; j++) System.out.print("#");
	            for(int k = 0; k<= hashC; k++) System.out.print(" ");
	            
//	            for(int j = 0; j<=spaceC; j++) System.out.print(" ");
//	            
//	            for(int k = 0; k<= hashC; k++) System.out.print("#");
	            System.out.println();
	        }

	    }
	public static void main(String ...s ) {
		staircase(6);
	}
}
