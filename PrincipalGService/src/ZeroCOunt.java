
public class ZeroCOunt {

	public static void main(String[] args) {
		System.out.println(zeros(9));
	}

	

    public static int zeros(int n){
    	int i, fact=1, count = 0;
    	for(i=1;i<=n;i++){  
    		System.out.println("number = "+i);
            fact=fact*i;    
    	} 
    	System.out.println("fact = "+fact);
         
    	String s = String.valueOf(fact);
                  
        for(i=0; i<s.length(); i++) {
            if(s.charAt(i) == '0') count +=1;
            else count = 0;
        }
        
        return count;
        
    }
}
