package method_overloading;

public class MethodOverloadingWIthAutoBoxing {
	
    
    // 1.overloaded method with primitive formal argument 
    public void method(int i) 
    { 
    	System.out.println("Primitive type int formal argument :" + i); 
    } 
      
    // overloaded method with reference formal argument 
    public void method(Integer i) 
    { 
        System.out.println("Reference type Integer formal argument :" + i); 
    } 
      
    // 2. overloaded method primitive formal argument 
    // and to be invoked for wrapper Object as overloaded method 
    // with wrapper object of same(Long) type as an argument is not  
    // available. 
    public void method(long i) 
    { 
        System.out.println("Primitive type long formal argument :" + i); 
    } 
	
	public static void main(String[] args) {
		MethodOverloadingWIthAutoBoxing c = new MethodOverloadingWIthAutoBoxing(); 
         
	        // invoking the method with different signature. 
	        c.method(10); 
	        c.method(new Integer(15)); 
	        c.method(new Long(100)); 
	          
	}

}
