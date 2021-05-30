package com.java8.lambda;

public class ThreadWIthLambdaExp {
	public static void main(String ...s) {
		
		System.out.println("Without Lambda expression.");
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("I am executing without lambda expression.");
			}
		};
		
		Thread thread1 = new Thread(runnable);
		
		
		System.out.println("WIth Lambda expression.");
		Runnable withLamdaRunnable = () -> {
			System.out.println("I'm here with Lambda expression.");
		};
		
		new Thread(withLamdaRunnable).start();
		
		new Thread(()-> {
				System.out.println("I m best code");
		}).start();
	}
}
