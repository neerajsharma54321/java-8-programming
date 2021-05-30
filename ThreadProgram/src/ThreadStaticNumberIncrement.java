
public class ThreadStaticNumberIncrement{

	public static void main(String[] args) {
		Thread t1 = new Thread1("Thread 1");
		Thread t2 = new Thread1("Thread 2");
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread{
	
	public Thread1(String threadName) {
		super(threadName);
	}
	private static int a;
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread()+" = i"+i+", value of a ="+a);
			a+=1;
			
		}
	}
}

