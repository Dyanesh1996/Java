package com.oops;

public class Main {

	public static void main(String[] args) {
		
		Car porsche = new Car();
		Car celerio = new Car();
		
		celerio.setModel("ZXI AMT");
		celerio.setDoors(4);
		celerio.setColor("Melange Gray");
		
		
		System.out.println("The model of car celerio is : " + celerio.getModel());
		System.out.println("The car celerio has : " + celerio.getDoors());
		System.out.println("Our Celerio has " + celerio.getColor() + " color");
	}

}
