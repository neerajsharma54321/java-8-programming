package com.prod.and.consumer;

public class Consumer implements Runnable {

	private Medicine medicine;
	
	public Consumer(Medicine medicine) {
		this.medicine = medicine;
	}
	
	@Override
	public void run() {
		this.consumeMedicine();
	}

	public void consumeMedicine() {
		while(true) {
		synchronized (medicine) {
			try {
				while(medicine.getCurrentStock() == 0) {
					System.out.println("I'm out of stock");
					medicine.wait();
				}
				
					medicine.setCurrentStock(medicine.getCurrentStock() -1);
					System.out.println("I consumed 1 medicine. stock = "+medicine.getCurrentStock());
					medicine.notify();
					
					 // makes the working of program easier 
                    // to  understand 
                    // Thread.sleep(1000); 
				
			}catch(InterruptedException ex) {
				System.err.println("Unable to handle the error"+ex.getMessage());
			}
		}
		}
	}
	
}
