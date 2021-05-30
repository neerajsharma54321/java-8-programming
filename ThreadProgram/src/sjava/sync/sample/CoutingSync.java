package sjava.sync.sample;

public class CoutingSync {
	public static void main(String ...s) {
		CountingSum cs = new CountingSum();
		// Thread t = new Thread(cs);
		
		cs.start();
		System.out.println("couting is started....");
		synchronized (cs) {
			try {
				if(!cs.status) cs.wait();
				System.out.println("before wait start");
			}catch(InterruptedException ex) {
				System.err.println("you are not handling me.");
			}
			
		}
		System.out.println("sum is ="+cs.getSum());
	}
}

class CountingSum extends Thread{
	
	private int total = 0;
	public boolean status = false;
	
	@Override
	public void run() {
			synchronized (this) {
				System.out.println("before loop start");
				  for(int i=0; i<100 ; i++){
		                total += i;
		            }
				  status = true;
					System.out.println("after loop end");
					notify();
		}
	}
	
	public int getSum() {
		return total; 
	}
	
}
