package multithreading;

public class RunnableDemo {
	public static void main(String ...s) {
		Thread t1 = new Thread(new MyRunnable(), "Thread1");
		Thread t2 = new Thread(new MyRunnable(), "Thread2");
		Thread t3 = new Thread(new MyRunnable(), "Thread3");
		// Thread t4 = new Thread(new MyRunnable(), "Thread4");
		t1.start();
		try {
			t1.join(2000);
		} catch(InterruptedException il) {
			System.err.println("Unable to join current thread "+Thread.currentThread());
		}
		t2.start();
		try {
			t1.join();
		} catch(InterruptedException il) {
			System.err.println("Unable to join current thread "+Thread.currentThread());
		}
		t3.start();
		
		try {
			t1.join();
			t1.join();
			t1.join();
		} catch(InterruptedException il) {
			System.err.println("Unable to join current thread "+Thread.currentThread());
		}
		// t4.start();
	}
}
