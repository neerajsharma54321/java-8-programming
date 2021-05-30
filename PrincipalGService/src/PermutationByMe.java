
// https://www.youtube.com/watch?v=GuTPwotSdYw
public class PermutationByMe {
	public static void main(String ...s) {
		String permStr = "ABC";
		new PermutationByMe().permute(permStr, 0, permStr.length() - 1);
	}

	private void permute(String s, int l, int r) {
		if(l == r) {
			System.out.println(s);
		} else {
			for(int i=l; i<=r; i++) {
				s = swap(s, l, i);
				permute(s, l+1, r);
			}
		}
	}
	
	private String swap(String s, int l, int r) {
		char chArr[] = s.toCharArray();
		chArr[l] = s.charAt(r);
		chArr[r] = s.charAt(l);
		return String.valueOf(chArr);
	}
	
	
}
