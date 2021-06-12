//-----------WITHOUT USING LAMBDA---------------


//Reduces number of lines significantly

package com.java.concurrency;

public class MutithreadingWithLambda {

	public static void main(String[] args) { 

		Thread t1 = new Thread(() -> // We've removed "new Runnable(){ public void run()}" with () ->
		{
			System.out.println("Hi");
		});
		
		
		Thread t2 = new Thread(() -> {
			System.out.println("Hello");
		});

		
		t1.start();
		try {
			t1.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}

}
