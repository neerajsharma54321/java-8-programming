import java.util.Arrays;

public class RemoveDuplicateNumberFromArray {
	public static void main(String ...s) {
		RemoveDuplicateNumberFromArray rm = new RemoveDuplicateNumberFromArray();
		int a [] = {2,5,5,6,8,9,11,22,33,33,44,58};
		int  finalArray[] = removeDuplicateNumber(a);
		for(int k=0; k<finalArray.length; k++) {
			System.out.printf("final[%d]=%d",k,finalArray[k]);
			System.out.printf(" \ta[%d]=%d",k,a[k]);
			System.out.println();
		}
	}
	
	private static int [] removeDuplicateNumber(int a[]) {
		int newArray[] = new int[a.length];
		int j = 0;
		if(a.length ==0 || a.length == 1) {
			return a;
		}
		for(int i=0; i<a.length - 1; i++) {
			if(a[i]!=a[i+1]) {
				newArray[j] = a[i];
				j +=1;
			}
		}
		newArray[j++] = a[a.length-1];
	
		return Arrays.copyOf(newArray, j);
	}
}
