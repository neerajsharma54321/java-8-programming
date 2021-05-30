
public class CountPairs {

	 static int countPairs(int a[], int n) 
	    { 
	  
	        // To find minimum and maximum of 
	        // the array 
	        int mn = Integer.MAX_VALUE; 
	        int mx = Integer.MIN_VALUE; 
	        for (int i = 0; i < n; i++) { 
	            mn = Math.min(mn, a[i]); 
	            mx = Math.max(mx, a[i]); 
	        } 
	  
	        // to find the count of minimum and 
	        // maximum elements 
	        int c1 = 0; 
	        int c2 = 0; // Count variables 
	        for (int i = 0; i < n; i++) { 
	            if (a[i] == mn) 
	                c1++; 
	            if (a[i] == mx) 
	                c2++; 
	        } 
	  
	        // condition for all elements equal 
	        if (mn == mx) 
	            return n * (n - 1) / 2; 
	        else
	            return c1 * c2; 
	    } 
	  
	    // Driver code 
	    public static void main(String[] args) 
	    { 
	        int a[] = { 3, 2, 1, 1, 3 }; 
	        int n = a.length; 
	        System.out.print(countPairs(a, n)); 
	    } 

}
