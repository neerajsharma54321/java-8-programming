import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BalancePi {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(5);
		//list.add(3);
		System.out.println(balancedSum(list));
		
	}
	
	 public static int balancedSum(List<Integer> sales) {
		 int pivot =0;
try{
	System.out.println("hello");
	            // Integer originalArr[] = (Integer[])sales.toArray();
	            int originalArr[]  = sales.stream().mapToInt(Integer::valueOf).toArray();
	            int n = originalArr.length;
	            int pArr[] = new int[n]; int sArr[] = new int[n];
	            pArr[0] = originalArr[0];
	        
	            IntStream.range(1, n).forEach(index -> {
	            	pArr[index] = pArr[index-1]+originalArr[index];
	            	System.out.print("elem = "+pArr[index]+ " index ="+index);
	            });
	          

	            int lastElem = sArr[0] = pArr[n-1];
	            System.out.println("\n last element"+lastElem+"' sArr[0]"+sArr[0]);
	            IntStream.range(1, n).forEach(index -> {
	            	System.out.print("sArr["+index+"] = "+sArr[index]+ "index ="+index+"   ,");
	            	sArr[index] = lastElem - pArr[index-1];
	            	System.out.println("sArr["+index+"] = "+sArr[index]);
	            });
	System.out.print("Hello\n");
	for(int i=0; i<n; i++){
	    System.out.println("pArr["+i+"]"+pArr[i]+",   sArr["+i+"]"+sArr[i]);
	    if(pArr[i] == sArr[i]) return i;
	}
	        }catch(Exception t) {
	        	System.err.println("ex"+t);
	        }
return pivot;
	    }


}
