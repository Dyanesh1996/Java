package com.oops.inheritance;

public class VehicleCarCelerioMain {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle(4, 1, 4, 3, 1, 2);
		Car car = new Car(1, 2, 0, 2, 1);
		
		Celerio celerio = new Celerio(7, 2, 3, 4, 5, "Melange gray");
		
		celerio.playMusic(false);
		
		celerio.CarPositionedorNot();
		
		car.changeGears(5);
		
	}

}
