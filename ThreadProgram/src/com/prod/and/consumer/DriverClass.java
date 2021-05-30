package com.prod.and.consumer;

public class DriverClass {
	public static void main(String ...s) {
		
		Medicine m = new Medicine(1, "Cipla Eye Drop", "CIPLA_101");
		
		Thread produceThread = new Thread(new Producer(m));
		Thread consumerThread = new Thread(new Consumer(m));
		consumerThread.start();
		produceThread.start();
	}
}
