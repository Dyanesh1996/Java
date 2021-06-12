/* Multithreading - creating multiple small threads to fasten our process with the help of multicore processor.

	
	- By default, we have a MAIN thread always.

	- the method start() of thread always calls method run() first. Hence no need to call run() method explicitly 
		as start() will automatically calls run().

	- Order of executing threads differ from computer to computer

*/

package com.java.concurrency;

class AnotherThread extends Thread{		//thread creation.(call any class a thread if it extends to Thread superclass)

	@Override
	public void run() {
		System.out.println("Hello from another thread");
	}
	
}

public class Threads {

	public static void main(String[] args) {
		System.out.println("Hello from the main thread");
		
		Thread anotherThread = new AnotherThread();
		//anotherThread.run(); 		No need to call this method as start() will automatically call run().
		anotherThread.start();		//starts and runs a thread.
		
		
		//Let's create anonymous class thread also.
		new Thread(){
			public void run() {
				System.out.println("Hello from anonymous thread");
			}	
		}.start();
		
		
		
		System.out.println("Hello again from the main thread.");
		//anotherThread.start();		-->can't invoke start() method again as thread is already started
	}

}
