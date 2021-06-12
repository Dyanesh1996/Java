/*
 * ---------Purpose of Join()---------
	Firstly, t1 will print Hi..Then Bye will be printed because main thread is sitting idle without any job.
	Hence, till the time t2 finishes it's work to print Hello, main will print Bye first
	
	We need to ask main thread to print Bye after t1 and t2 prints Hi and Hello.
	Use join to achieve this.
	
	t1.join() will join t1 to main after it's task completion
	t2.join() will join t2 to main after it's task completion.t



	--------Purpose of isAlive()--------
	To check if any thread is running or not.
	
	

*/
package com.java.concurrency;

public class JoinAndAlive {

	public static void main(String[] args) throws Exception { 

		Thread t1 = new Thread(() -> // We've removed "new Runnable(){ public void run()}" with () ->
		{
			System.out.println("Hi");
		});
		
		
		Thread t2 = new Thread(() -> {			
			System.out.println("Hello");
		});

		
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
