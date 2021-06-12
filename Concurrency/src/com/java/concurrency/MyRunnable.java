/*	
	- Runnable is another way of creating a thread.
	- We never call the run() method. We call start method.
		(We have to implement the run() method but while calling, we call start() method)

*/

package com.java.concurrency;

public class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Hello from MyRunnable's implementation of run()");
	}
	

	public static void main(String[] args) {
		
		Thread myRunnableThread = new Thread(new MyRunnable());
		myRunnableThread.start();
		
		//------------------OR------------------------------//
		
		Thread myRunnableThread2 = new Thread(new MyRunnable() {
			public void run() {
				System.out.println("Hello from anonymous class's implementation of run()");
			}
		});
		
		myRunnableThread2.start();
		
	}

}
