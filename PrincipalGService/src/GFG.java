// which contains the character C exactly K times  
class GFG  
{ 
  
    // Function to count the number of substrings  
    // which contains the character C exactly K times  
    static int countSubString(String s, char c, int k)  
    { 
        // left and right counters for characters on  
        // both sides of substring window  
        int leftCount = 0, rightCount = 0; 
  
        // left and right pointer on both sides  
        // of substring window  
        int left = 0, right = 0; 
  
        // intialize the frequency  
        int freq = 0; 
  
        // result and length of string  
        int result = 0, len = s.length(); 
  
        // initialize the left pointer  
        while (s.charAt(left) != c && left < len)  
        { 
            left++; 
            leftCount++; 
        } 
  
        // initialize the right pointer  
        right = left + 1; 
        while (freq != (k - 1) && (right - 1) < len)  
        { 
            if (s.charAt(right) == c) 
            { 
                freq++; 
            } 
            right++; 
        } 
  
        // traverse all the window substrings  
        while (left < len && (right - 1) < len) 
        { 
  
            // counting the characters on leftSide  
            // of substring window  
            while (s.charAt(left) != c && left < len)  
            { 
                left++; 
                leftCount++; 
            } 
  
            // counting the characters on rightSide of  
            // substring window  
            while (right < len && s.charAt(right) != c) 
            { 
                if (s.charAt(right) == c) 
                { 
                    freq++; 
                } 
                right++; 
                rightCount++; 
            } 
  
            // Add the possible substrings on both  
            // sides to result  
            result = result + (leftCount + 1) * (rightCount + 1); 
  
            // Setting the frequency for next  
            // substring window  
            freq = k - 1; 
  
            // reset the left, right counters  
            leftCount = 0; 
            rightCount = 0; 
  
            left++; 
            right++; 
        } 
  
        return result; 
    } 
  
    // Driver code 
    public static void main(String args[])  
    { 
        String s = "212"; 
        char c = '2'; 
        int k = 1; 
  
        System.out.println(countSubString(s, c, k)); 
        
//        Input : str = "3123231", c = '3', k = 2
//        		Output : 4
//        		Possible substrings are {"2", "21", "12", "2"}
//        		that contains 2 exactly 1 time.
//
//        		Input  : str = "55555", c = '5', k = 4
//        		Output : 2
//        		Possible substrings are {"5555", "5555"} 
//        		that contains 5 exactly 4 times
    } 
}