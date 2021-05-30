import java.util.HashMap;
import java.util.Map;

public class KangarooJump {
	// Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
      
      // when x1= 2, v1 =5 and x2 = 1, v2 =6  then they never meet
      if(x1 > x2 && v1 >= v2) return "NO";
      // if both are equal.
      if(x1 == x2) return "YES";
      
      int min = Math.min(v1, v2); int max = Math.max(v1, v2);
      Map<Integer, Integer> mapMin = new HashMap<Integer,Integer>();
      Map<Integer, Integer> mapMax = new HashMap<Integer,Integer>();
      if(min == v1) mapMin.put(v1, x1); else mapMin.put(v2, x2);
      if(max == v1) mapMax.put(v1, x1); else mapMax.put(v2, x2);

      while(mapMin.get(min) > mapMax.get(max)) {
        mapMin.replace(min, mapMin.get(min) + min);
        mapMax.replace(max, mapMax.get(max) + max);
        if(Integer.compare(mapMax.get(max),mapMin.get(min)) == 0) {
        	return "YES";
        } 
      }
      return "NO";
      
    }
    
    public static void main(String ...s) {
    	System.out.println(kangaroo(0, 3 , 4 , 2));
    	System.out.println(kangaroo(14 ,4 ,98, 2));
    	System.out.println(kangaroo(43, 2, 70, 2));	
    	
    	
    }
}

