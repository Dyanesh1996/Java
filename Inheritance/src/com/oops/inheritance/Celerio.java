package com.oops.inheritance;

public class Celerio extends Car {
	
		String colour;
		
		public Celerio(int bootspace, int headlights, int autogear, int foglights, int steeringControls, String colour) {
		super(bootspace, headlights, autogear, foglights, steeringControls);
		
		this.colour = colour;
	}

		public void playMusic(boolean bluetooth) {
		if(bluetooth == true) {
			System.out.println("Yeeee,,sounds on!!!");
		}else {
			System.out.println("Can't play music");
		}		
		
	}
		public void CarPositionedorNot() {
			super.moving(20);
			moving(0);
		}
	
}
