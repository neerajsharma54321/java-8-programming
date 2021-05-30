import java.util.*;

public class RankProblem {

	public static void main(String[] args) {
		Integer scores[] = new Integer[] {100,90, 90, 80, 75, 60};
		climbingLeaderboard(scores, scores);
	}
	
    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(Integer[] scores, Integer[] alice) {
            Map<Integer,Integer> map = new TreeMap<Integer, Integer>();
            int max = Integer.MIN_VALUE;
            Set<Integer> set = new TreeSet<Integer>();
            set.addAll(Arrays.asList(scores));
            System.out.println(set);
            int rank = 0;
             for(int num: set){
                 System.out.println("num"+num);
                 map.put(rank +=1, num);
             }
            return null;

    }

}
