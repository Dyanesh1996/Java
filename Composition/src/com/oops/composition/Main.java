package com.oops.composition;

public class Main {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(10, 5, 2);
		Case theCase = new Case("Lattitude 5400", "Dell", "220", dimensions);	//dimensions is an object of a class treated as variable
		
		
		
		Monitor monitor = new Monitor("27B", "Dell", 12, new Resolution(1289, 1674));	//same as : Resolution nativeResolution = new Resolution(5, 4);
		
		Motherboard motherboard = new Motherboard("BG-258", "HP", 4, 3, "v2.44");
		
		PC pc = new PC(motherboard, monitor, theCase);
		
		//how do we access the method drawPixel of monitor class?
		//Simply in a following way..
		
		pc.getMotherboard().loadProgram("Ubuntu 15.06");
		pc.getMonitor().drawPixelAt(3, 4, "red");
		pc.getTheCase().pressPowerbutton();
		
		
	}

}
