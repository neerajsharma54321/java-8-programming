package method_overloading;

public class MethodOverloadingWIthNull {

	 // Overloaded methods 
    public void fun(Integer i) 
    { 
        System.out.println("fun(Integer ) "); 
    } 
    public void fun(String name) 
    { 
        System.out.println("fun(String ) "); 
    } 
    public void fun(Object o) {
    	System.out.println("fun (Object)");
    }
	
	public static void main(String[] args) {
		MethodOverloadingWIthNull nullValue = new MethodOverloadingWIthNull();
		nullValue.fun("Neeraj");
		// The below line gives an error because null can be accepted by both of the method
		// nullValue.fun(null);
		
		// here we are not passing the null value intentially. It is the general scenario
		Integer i = null;
		nullValue.fun(i); 
		// nullValue.fun();
	}

}
