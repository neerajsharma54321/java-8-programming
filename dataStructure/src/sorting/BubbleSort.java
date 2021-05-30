package sorting;

public class BubbleSort {
	public static void main(String ...str) {
		int arr[] = {20, 35, -15, 7, 55, 1, -22};
		int k = 0;
		
		for(int i=arr.length-1; i>0; i--)
			for(int j=0; j<i; j++) {
				if(arr[j] > arr[j+1])
					swap(arr, j, j+1);
			}
		
		for(;k<arr.length; k++)
			System.out.println(arr[k]);
	}
	
	private static void swap(int arr[], int i, int j) {
		int temp;
		if(i == j) return;
		
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
