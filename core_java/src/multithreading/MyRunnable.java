package multithreading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Current thread is ="+Thread.currentThread());
	}

}
