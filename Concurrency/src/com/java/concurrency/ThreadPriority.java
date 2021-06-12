/*
 	//How to get thread priority---------------
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
 	
 Range of priorities---------
 	1-10, 1-> Least priority, 10-> highest priority, 5-> normal priority
 
 By default, thread priority is 5
 
 
*/
package com.java.concurrency;

public class ThreadPriority {

	public static void main(String[] args) throws Exception { 

		Thread t1 = new Thread(() -> // We've removed "new Runnable(){ public void run()}" with () ->
		{
			System.out.println("Hi " + Thread.currentThread().getPriority());	
		});
		
		
		Thread t2 = new Thread(() -> {			
			System.out.println("Hello " + Thread.currentThread().getPriority());
		});
		
		
		//How to get thread priority---------------
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		//How to change thread priority------------
		t1.setPriority(10);
		t2.setPriority(2);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		
		//How to get thread names-----------------
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		//How to set customer names to thread and get them
		t1.setName("ThreadHI");					//name can also be passed as a parameter to new Thread()
		System.out.println(t1.getName());

		
		t1.start();								//t1 will print this
		try {
			t1.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();								//t2 will print this
		
		
		System.out.println(t2.isAlive()); 		//prints true as t2 is still running
		
		//Using join here to make main do it's task only after t1 and t2 finishes theirs
		t1.join();
		t2.join();
		
		
		System.out.println(t2.isAlive()); 		//prints false as t2 is now joined to main and is no longer running
		
		System.out.println("Bye");				//main thread will print this before t2
	}

}
