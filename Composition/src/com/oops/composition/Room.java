package com.oops.composition;

public class Room {
	
	private int doors;
	private int windows;
	private int beds;
	private Wardrobe wardrobe;
	private Sitout sitout;
	
	
	public Room(int doors, int windows, int beds, Wardrobe wardrobe) {
		super();
		this.doors = doors;
		this.windows = windows;
		this.beds = beds;
		this.wardrobe = wardrobe;
	}
	
	
	public void openTheDoor() {
		System.out.println("Khul ja SimSim...");
		sitout.enjoyTheCoffeeWithView();
	}


	public int getDoors() {
		return doors;
	}


	public int getWindows() {
		return windows;
	}


	public int getBeds() {
		return beds;
	}


	public Wardrobe getWardrobe() {
		return wardrobe;
	}


	public Sitout getSitout() {
		return sitout;
	}

	
	
	
}
