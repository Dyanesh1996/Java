package com.oops.polymorphism;

class TheCar {
	private boolean engine;
	private int wheels;
	private int doors;
	private int headlights;
	private int cylinders;
	
	public TheCar(int doors, int headlights, int cylinders) {
		this.engine = true;
		this.wheels = 4;
		this.doors = doors;
		this.headlights = headlights;
		this.cylinders = cylinders;
	}


	public boolean isEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	int getDoors() {
		return doors;
	}

	public int getHeadlights() {
		return headlights;
	}

	public int getCylinders() {
		return cylinders;
	}
	
	
	public void startEngine(boolean engine) {
		System.out.println("Engine has started..");
	}
	
	public void accelrate() {
		System.out.println("The car is moving");
	}
	
	public void brake() {
		System.out.println("Brake and stop the car");
	}
}



class Celerio extends TheCar {
	
	public Celerio(int doors, int headlights, int cylinders) {
		super(doors, headlights, cylinders);
	}

	@Override
	public void startEngine(boolean engine) {
		System.out.println("Celerio's engine has started..");
	}
	
}


class Tiago extends TheCar{
	public Tiago(int doors, int headlights, int cylinders) {
		super(doors, headlights, cylinders);
	}
	
	public void accelrate() {
		System.out.println("The Tiago is moving");	
		//or 
		//System.out.println(getClass().getSimpleName() + " is moving");	//getClass().getSimpleName() equals to className
	}
	
}


public class Car {

	public static void main(String[] args) {
		
		TheCar thecar = new TheCar(4, 2, 3);
		thecar.startEngine(true);
		thecar.accelrate();
		thecar.brake();
		
		
		Celerio celerio = new Celerio(4, 2, 7);
		celerio.startEngine(true); 	//same method as from TheCar class..hence method overriding
		
		
		Tiago tiago = new Tiago(4, 2, 6);
		tiago.accelrate();		//same method as from TheCar class(Base class)..hence method overriding
		
		
	}

}
