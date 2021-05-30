import java.util.HashMap;
import java.util.Map;

public class BirthdayCandleCount {

    static int birthdayCakeCandles(int[] ar) {
        int max = Integer.MIN_VALUE;

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i<ar.length; i++) {
            if(map.containsKey(ar[i])) {
            	 map.replace(ar[i], map.get(ar[i]) + 1);
            }else {
            	 map.put(ar[i], 1);
            }
            max = Math.max(max, ar[i]);
        }
        return map.get(max);
    }
    
    public static void main(String ...s) {
    	int ar [] = {5,6,9,8,5,5,9};
    	System.out.println(birthdayCakeCandles(ar));
    }
}
