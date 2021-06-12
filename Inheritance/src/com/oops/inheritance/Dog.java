package com.oops.inheritance;

public class Dog extends Animal {
	
	private int eyes;
	private int legs;
	private int tail;
	private String coat;
	
	
	public Dog(String name, int size, int weight,int eyes, int legs, int tail, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.coat = coat;
	}
	
	public void chew() {
		System.out.println("chew method called ");
		
	}

	@Override
	public void eat() {
		System.out.println("method chew is overriding method eat of dog class");
		chew();			//calling chew method
		super.eat();	//calling eat method from superclass Animal
	}
	
	
	public void walk() {
		System.out.println("Dog.walk() called");
		super.move(15);			//super.move() will call move() method from base class Animal
	}
	
	public void run() {
		System.out.println("Dog.run() called");
		move(25);				//plain move() will call move() frm this Dog class if there's any
	}
	
	
}
