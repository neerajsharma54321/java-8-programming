import java.util.HashSet;

public class SmallestPositiveInteger {
	// Function to find the smallest 
	// positive missing number 
	static int findMissingPositive(int arr[], int n) 
	{ 
	    // Default smallest Positive Integer 
	    int m = 1; 
	  
	    // Store values in set which are 
	    // greater than variable m 
	    HashSet<Integer> x = new HashSet<Integer>(); 
	  
	    for (int i = 0; i < n; i++) 
	    { 
	        // Store value when m is less than 
	        // current index of given array 
	        if (m < arr[i]) 
	        { 
	            x.add(arr[i]); 
	        } 
	        else if (m == arr[i]) 
	        { 
	            // Increment m when it is equal 
	            // to current element 
	            m = m + 1; 
	  
	            while (x.contains(m))  
	            { 
	                x.remove(m); 
	  
	                // Increment m when it is one of the 
	                // element of the set 
	                m = m + 1; 
	            } 
	        } 
	    } 
	  
	    // Return the required answer 
	    return m; 
	} 
	  
	// Driver code 
	public static void main(String[] args)  
	{ 
	    int arr[] = { 2, 3, -7, 6, 8, 1, -10, 15 }; 
	  
	    int n = arr.length; 
	  
	    // Function call 
	    System.out.println(findMissingPositive(arr, n)); 
	} 
	} 
