package sorting;

public class InsertionSort {
	public static void main(String str[]) {
		int arr[] = {20, 35, -15, 7, 55, 1, -22};
		
		int sortedIndex = 0;
		for(int unsortedIndex=1; unsortedIndex<=arr.length-1; unsortedIndex++) {
			int curValue = arr[unsortedIndex]; 
			int hole = unsortedIndex;
			while(hole>0 && arr[hole-1]>curValue) 
				arr[hole] = arr[hole -=1];
				
			arr[hole] = curValue;
		}
		
		for(int k=0;k<arr.length; k++)
			System.out.println(arr[k]);
		
	}

}
