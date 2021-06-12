package com.oops.polymorphism;

//same method name, same parameters in different classes--> Method overriding...following is the example

class Bird{
	public void sing() {
		System.out.println("tweet tweet tweet");
	}
}

class Robin extends Bird{
	public void sing() {
		System.out.println("Twiddleeetweettwee");
	}
}



public class PolymorphismAlex {

	public static void main(String[] args) {
		
		Robin r = new Robin();
		r.sing();				//method sing of Robin class is overriding method sing of parent class, Bird.
		
								//similarly, we can call sing method of Bird class by creating object of Bird class
		
	}

}
