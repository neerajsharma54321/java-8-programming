package sorting;

public class SelectionSort {
	public static void main(String str[]) {
		
		int arr[] = {20, 35, -15, 7, 55, 1, -22};
		
		int k=0;
		
		for(int i= arr.length-1; i>0; i--) {
			int largeElemIndex = 0;
			for(int j=1; j<=i; j++) {
				if(arr[j] > arr[largeElemIndex])
					largeElemIndex = j;
			}
			swap(arr, largeElemIndex, i);
		}
		
		for(;k<arr.length; k++)
			System.out.println(arr[k]);
	}
	
	public static void swap(int arr[], int currentIndex, int nextIndex) {
		int temp;
		if(currentIndex == nextIndex) return;
		
		temp = arr[currentIndex];
		arr[currentIndex] = arr[nextIndex];
		arr[nextIndex] = temp;
	}
}
