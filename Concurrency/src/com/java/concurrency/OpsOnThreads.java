/*	
	- Runnable is another way of creating a thread.
	- We never call the run() method. We call start method.
		(We have to implement the run() method but while calling, we call start() method)

*/

package com.java.concurrency;

public class OpsOnThreads implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Hello from MyRunnable's implementation of run()");
	}
	

	public static void main(String[] args) {
		
		Thread myRunnableThread = new Thread(new OpsOnThreads());
		myRunnableThread.start();
		try {
			myRunnableThread.sleep(2000);		//Will start the thread-->will make that already started thread sleep for 2 secs--> will start next thread after 2 secs
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  			
		
		
		
		//------------------OR------------------------------//
		
		Thread myRunnableThread2 = new Thread(new OpsOnThreads() {
			public void run() {
				System.out.println("2 seconds have passed and hello again from anonymous class's implementation of run()");
			}
		});
		
		myRunnableThread2.start();
		
	}

}
