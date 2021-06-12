package com.oops.inheritance;

public class Car extends Vehicle {
	
	private int autogear;
	private int foglights;
	private int steeringControls;
	public Car(int bootspace, int headlights, int autogear,
			int foglights, int steeringControls) {
		super(1, 1, 4, 3, bootspace, headlights);
		this.autogear = autogear;
		this.foglights = foglights;
		this.steeringControls = steeringControls;
	}
	
	public void changeGears(int knobposition) {
		if(knobposition == 1) {
			System.out.println("You're okay to drive with speed of 10-20kms/hr.");
		}else if(knobposition == 2) {
			System.out.println("You're okay to drive with speed of 20-40kms/hr.");
		}else if(knobposition == 3) {
			System.out.println("You're okay to drive with speed of 40-60kms/hr.");
		}else if(knobposition == 4) {
			System.out.println("You're okay to drive with speed of 60-80kms/hr.");
		}else if(knobposition ==5) {
			System.out.println("You're okay to drive with speed of above 80kms/hr.");
		}
	}
	
	public void moving(int speed) {
		if(speed > 0) {
			System.out.println("You're driving the car.");
		}else {
			System.out.println("Car is parked.");
		}	
	}
}