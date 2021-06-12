package com.Udemy.Abstraction;

public class Bird extends Animal{

	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is eating");
	}

	@Override
	public void breathe() {
		System.out.println(getName() + " is breathing");
	}
	
	public void fly() {
		System.out.println(getName() + " is flying");
	}

}
