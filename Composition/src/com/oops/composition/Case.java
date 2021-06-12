package com.oops.composition;

public class Case {
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimensions dimensions;	//object dimensions of class Dimensions is treated as instance variable
	
	public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}
	
	public void pressPowerbutton() {
		System.out.println("Power button pressed.");
	}
	
}
