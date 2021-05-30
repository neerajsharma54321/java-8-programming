
public class RemoveDuplicateNumber {
	public static void main(String ...args) {
		int a[] = {1,2,5,8,8,9,56};
		RemoveDuplicateNumber rdn = new RemoveDuplicateNumber();
		rdn.removeDuplicateNumbe(a);
		
	}
	
	private int[] removeDuplicateNumbe(int a []) {
		String s = new String();
		for(int j=0;j<a.length;j++) {
			String stringArray[] = s.split("m");
			System.out.println("sting sfjdk"+stringArray.length);
			boolean isDuplicateDataAvailable = false;
			innerLoop:
			for(int k=0; k<stringArray.length; k++) {
				if(Integer.parseInt(stringArray[k]) == a[j]) {
					isDuplicateDataAvailable = true;
					break innerLoop;
				}
			}
			if(isDuplicateDataAvailable) {
				s.concat('\t'+String.valueOf(a[j]));
			}
		}
		String finalStringArray[] = s.split("m");
		int c[] = new int[s.length()], index = 0;
		for (String individualArray : finalStringArray) {
			c[index] = Integer.parseInt(individualArray);
		}
		System.out.println(finalStringArray);
		return c;
	}
	
}
