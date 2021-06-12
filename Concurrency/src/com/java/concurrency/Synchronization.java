/*
 * Synchronized will allow only one thread to access the method at a time.
 * till t1 accesses the increment method, t2 remains idle..once t1 finishes, t2 starts accessing increment method
 * 
 * 
 */


package com.java.concurrency;

class Counter {
	int count;

	public synchronized void increment() {		//synchronized will allow only one thread to access this method at a time
		count++;
	}
}

public class Synchronization {

	public static void main(String[] args) throws Exception {
		Counter c = new Counter();
		c.increment();

		// How to count using Threads?

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 1000; i++) {
					c.increment();
				}
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 1000; i++) {
					c.increment();
				}
			}
		});
		
		 
		
		t1.start(); 	//will execute anonymous class under thread t1
		t2.start();		//will execute anonymous class under thread t2
		t1.join(); 		// using join because, by the time t1 finishes executing it's job, main thread keeps doing it's job under "System.out.println("Count : " + c.count);" 
		t2.join();
		
		System.out.println("Count : " + c.count); 
	}

}
