package multithreading;

public class MyThread extends Thread{
	public void run() {
		System.out.println("Current thread name is = "+currentThread());
	}

	public static void main(String ...str) {
		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();
		MyThread myThread3 = new MyThread();
		MyThread myThread4 = new MyThread();
		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
	}
}