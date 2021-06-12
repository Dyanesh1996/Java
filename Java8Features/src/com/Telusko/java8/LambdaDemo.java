//	- Lambda expression is a way to implement interface without having to create a new class.
//	- Lambda expressions only work with interface having only 1 method which is called functional interface.



package com.Telusko.java8;


interface A{
	public void show();
}

/*class xyz implements A{
	public void show() {
		System.out.println("Hello");
	}
}*/


public class LambdaDemo {

	public static void main(String[] args) {
		
		/*A obj = new A() {						//Anonymous inner class
				public void show() {
					System.out.println("Hello");
				}
		};*/
		
		A obj = () -> System.out.println("Hello");		//Use of Lambda
		
		obj.show();
	}

}
