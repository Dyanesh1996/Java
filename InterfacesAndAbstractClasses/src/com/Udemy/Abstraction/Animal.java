package com.Udemy.Abstraction;

public abstract class Animal {
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public abstract void eat();
	public abstract void breathe();

	public String getName() {
		return name;
	}
	
}
