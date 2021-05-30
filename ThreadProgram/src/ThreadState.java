
public class ThreadState {
	public static void main(String ...s) throws InterruptedException {
		ThreadStateDemo thread1 = new ThreadStateDemo();
		Thread t = new Thread(thread1);
		System.out.println(t.getState());
		
		t.start();
		System.out.println(t.getState());
		
		t.join();
		System.out.println(t.getState());
		
		t.sleep(500);
		System.out.println(t.getState());
		
		
	}
}

class ThreadStateDemo implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
	}
	
}
