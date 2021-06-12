//-----------WITHOUT USING LAMBDA---------------

package com.java.concurrency;

class Hi implements Runnable {

	@Override
	public void run() {
		System.out.println("Hi");

	}

}

class Hello implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello");
	}

}

public class MultithreadingWithoutLambda {

	public static void main(String[] args) {
		Thread hiThread = new Thread(new Hi());
		Thread helloThread = new Thread(new Hello());

		hiThread.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		helloThread.start();

	}

}
