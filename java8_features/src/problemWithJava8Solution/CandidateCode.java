package problemWithJava8Solution;

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int outputAr[] = new int[testCases];
        
        String shopWithCost[] = scanner.next().split(" ");
        
        int numberOfShops = Integer.parseInt(shopWithCost[0]);
        int inputs = Integer.parseInt(shopWithCost[1]);
        
        List<Calc> list = new ArrayList<Calc>();
        
        for(int i=0; i<inputs; i++) {
        	String vals = scanner.next();
        	
        }
        
        class Calc{
        	int x, y, pCost;
        	@SuppressWarnings("unused")
			public Calc(String x, String y, String pCost) {
				this.x = Integer.parseInt(x);
				this.y = Integer.parseInt(y);
				this.pCost = Integer.parseInt(pCost);
			}
        	
        }
   }
}