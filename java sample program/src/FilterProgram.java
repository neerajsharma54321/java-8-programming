
public class FilterProgram {
	public static void main(String ...s) {
		FilterProgram fp = new FilterProgram();
		int arra[] = {1,2,3,4,5,6,7,8,9,10};
		int filter[] = {1,2,1};
		try {
			
			int data[] = fp.filterOutput(arra, filter);
			for(int i=0; i<data.length; i++) {
				System.out.print(data[i]+" ");
			}
		}catch(Exception ex) {
			System.err.println(ex);
		}
	}
	
	private int[] filterOutput(int [] array, int filter[] ) throws Exception {
		
		int finalArray[] = new int[array.length - (filter.length -1)];
		if(filter.length> array.length) throw new Exception("filter length is greater");
		
		for(int i=0; i<array.length - (filter.length - 1); i++) {
			int a = 0, k = 0;
			for(int j=0; j<filter.length; j++) {
				a += (array[i+k] * filter[j]);
				k+=1;
			}
			finalArray[i] = a;
		}
		return finalArray;
	} 
}
