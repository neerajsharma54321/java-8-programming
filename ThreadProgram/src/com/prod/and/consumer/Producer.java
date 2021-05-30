package com.prod.and.consumer;
public class Producer implements Runnable {

	private Medicine medicine;
	
	public Producer(Medicine medicine) {
		this.medicine = medicine;
	}
	
	@Override
	public void run() {
		this.produceMedicine();
	}
	
	public void produceMedicine() {
		while(true) {
		synchronized (medicine) {
			try {
				while(this.medicine.getCurrentStock() == this.medicine.MAX_MEDICINE) {
					System.out.println("I produces as my capacity.");
					medicine.wait();
				}
				
					this.medicine.setCurrentStock(this.medicine.getCurrentStock()+1);
					System.out.println("I produced 1 medicine.  stock = "+medicine.getCurrentStock());
					this.medicine.notify();
					 // makes the working of program easier 
                    // to  understand 
                   // Thread.sleep(1000); 
				
			}catch (InterruptedException e) {
				System.err.println("Unable to handle generate medicine in producer.");
			}
		}
		}
	}

}