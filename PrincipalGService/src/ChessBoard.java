import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChessBoard {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		Integer []a = new Integer[]{0,1};
		List<Integer> list1 = Arrays.asList(a);
		
		Integer []b = new Integer[]{1, 0};
		List<Integer> list2 = Arrays.asList(b);
		
		list.add(list1);
		list.add(list2);
		
		System.out.println(solve(list));;
	}
	
    static String solve(List<List<Integer>> board) {
        int previous = -1, current = -1;
        for(int i=0; i<board.size(); i++) {
            for(int j=0; j<board.get(i).size(); j++){
                if(previous != -1){
                   current = board.get(i).get(j);
                   if(current == previous) return "NO";
                   else previous = current;
                }else {
                    previous = board.get(i).get(0);
                }
            }
            previous = previous == 0 ? 1 : 0;
        }
        return "YES";

    }

}
