package com.oops.inheritance;

public class Fish extends Animal{
	 
	private int gills;
	private int fins;
	private int eyes;
	
	public Fish(String name, int size, int weight, int gills, int fins, int eyes) {//we've removed brain and body parameters and assigned values 1 to them
		
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.fins = fins;
		this.eyes = eyes;
	}
	
	
	public void rest() {
		
	}
	
	public void moveMuscles() {
		System.out.println("Fish.moveMuscles() called");
	}
	
	public void moveBackFins() {
		System.out.println("Fish.moveBackFins() called");
		
	}
	
	public void swim(int speed) {
		moveMuscles();
		moveBackFins();
		super.move(30);
		
	}
	
	

}
