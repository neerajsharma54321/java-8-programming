package method_overloading;

public class MethodOverloadingwithWidening {

	// overloaded method 
    public void method(int i) 
    { 
        System.out.println("Primitive type int formal argument :" + i); 
    } 
      
    // overloaded method primitive formal argument 
    // and to be invoked for wrapper Object as  
  
    public void method(float i) 
    { 
          
        System.out.println("Primitive type float formal argument :" + i); 
    } 
	public static void main(String[] args) {
		MethodOverloadingwithWidening c = new MethodOverloadingwithWidening(); 
		// invoking the method with signature 
        // has widened data type 
        c.method(10);
        
        // for the below method call float parameterized method will be execute because
        // a method with long accepted paramter is not available and 
        // float is the higher data type then long
        c.method(new Long(100)); 
	}

}
