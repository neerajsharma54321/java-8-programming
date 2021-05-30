
public class MaxContinousSum {
	public static void main(String ...s) {
		int a[] = {2, 1, 2 , 23, 23, 4 , 8, 8 , 9 , 7};
		
		int b[] = {1, 2, 3, 4, 4, 5, 1, 2, 1, 8};
		
		int c [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(sum(a));
		System.out.println(sum(b));
		System.out.println(sum(c));
	}
	
	private static int sum(int arr[]) {
		int currentMax = Integer.MIN_VALUE, previous = -1;
		int previousMax = 0;
		for(int i=0; i<arr.length; i++) {
			if(previous == arr[i]) {
				currentMax = Math.max(currentMax, previousMax);
				previousMax = arr[i];
				continue;
			}
			else {
				previous = arr[i];
				previousMax += arr[i];
			}
		}
		
		return Math.max(previousMax, currentMax);
	}
}
