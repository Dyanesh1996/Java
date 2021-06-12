package com.oops.inheritance;

public class Vehicle {
	private int wheels;
	private int gearknob;
	private int doors;
	private int wipers;
	private int bootspace;
	private int headlights;
	
	
	public Vehicle(int wheels, int gearknob, int doors, int wipers, int bootspace, int headlights) {
		this.wheels = wheels;
		this.gearknob = gearknob;
		this.doors = doors;
		this.wipers = wipers;
		this.bootspace = bootspace;
		this.headlights = headlights;
	}
	
	
	
	public int getWheels() {
		return wheels;
	}



	public void setWheels(int wheels) {
		this.wheels = wheels;
	}



	public int getGearknob() {
		return gearknob;
	}



	public void setGearknob(int gearknob) {
		this.gearknob = gearknob;
	}



	public int getDoors() {
		return doors;
	}



	public void setDoors(int doors) {
		this.doors = doors;
	}



	public int getWipers() {
		return wipers;
	}



	public void setWipers(int wipers) {
		this.wipers = wipers;
	}



	public int getBootspace() {
		return bootspace;
	}



	public void setBootspace(int bootspace) {
		this.bootspace = bootspace;
	}



	public int getHeadlights() {
		return headlights;
	}



	public void setHeadlights(int headlights) {
		this.headlights = headlights;
	}



	public void handSteering(int steering) {
		System.out.println("Steering can be handled");
	}
	
	
	
}
