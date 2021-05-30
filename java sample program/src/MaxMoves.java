import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMoves {
	 public static int maxMoves(String s, String t) {
	        int counter = 0;
	        while(s.contains(t)) {
	            int  beginIndex = s.indexOf(t);
	            System.out.println("beginIndex "+ beginIndex);
	          
	            // s = s.substring(beginIndex, Math.min((beginIndex + t.length()), s.length()-1));
	            String firstSt= s.substring(0, beginIndex);
	            String lastStr = s.substring(beginIndex + t.length(), s.length());
	            
	            s = firstSt + lastStr;
	            counter +=1;
	        }
	        // if(s.length() == 0) return 0;
	        return counter;
	    }
	
	 public static char firstRepeating(String r) {
		 char ch [] = r.toCharArray();
		 
		 for(int j=0; j<ch.length; j++) {
		 for(int i=1; i<ch.length; i++) {
			 if(ch[j] == ch[i]) {
				 return ch[j];
			 }
		 }
		 }
		 return 0;
	 }
	 

	    static int getTotalCandlesBurnt(int amount, int costOfCandle, int noOfResidueCandles) {
	    	int count = 0;
	        int numberOfCandle = count = (amount/costOfCandle);
	        
	        while(numberOfCandle > noOfResidueCandles) {
	        	count += numberOfCandle/noOfResidueCandles;
	        	numberOfCandle = numberOfCandle/noOfResidueCandles;
	        }
	        
	       return count;

	    }
	    private int recursion(List<Integer> sublist, boolean canSkip, int sum) {
	    	// List<Integer> sublist = Arrays.stream(a).boxed().collect(Collectors.toList());
	        if (sublist.isEmpty()) {
	            return sum;
	        }
	        int minSum = Integer.MIN_VALUE;
	        int sumWithoutSkip;
	        Integer integer = sublist.get(0);

	        if (canSkip) {
	            minSum = recursion(sublist.subList(1, sublist.size()), false, sum);
	        }
	        sumWithoutSkip = recursion(sublist.subList(1, sublist.size()), true, integer + sum);

	        return minSum > sumWithoutSkip ? minSum : sumWithoutSkip;
	    }
	 
	 public static void main(String ...s ) {
		 System.out.println(getTotalCandlesBurnt(12, 2, 2));
//		System.out.println(maxMoves("aabb", "ab"));
//		 System.out.println(maxMoves("aabcbdc", "abc"));
		// System.out.println(firstRepeating("finding"));;
	 }
}
