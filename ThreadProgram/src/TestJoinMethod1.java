class TestJoinMethod1 extends Thread{ 
	
private TestJoinMethod1(String threadName) {
	super(threadName);
}
 public void run(){  
  for(int i=1;i<=10;i++){  
   try{  
   Thread.sleep(500);  
   }catch(Exception e){System.out.println(e);}  
  System.out.println(Thread.currentThread().getName()+" = "+i);  
  }  
 }  
 
public static void main(String args[]) throws InterruptedException{  
 TestJoinMethod1 t1=new TestJoinMethod1("thread1");  
 TestJoinMethod1 t2=new TestJoinMethod1("thread2");  
 TestJoinMethod1 t3=new TestJoinMethod1("thread3");  
 t1.start();  
 try{  
	 // First t1 will completes its execution then other thread will come to the picture
  t1.join();  
 }catch(Exception e){System.out.println(e);}  
  
 t2.start();  
  // t2.join();
 t3.start();  
 }  
}  