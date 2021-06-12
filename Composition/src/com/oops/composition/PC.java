package com.oops.composition;

public class PC {
	private Motherboard motherboard;	//object motherboard of class Motherboard being treated as instance variable
	private Monitor monitor;
	private Case theCase;
	
	public PC (Motherboard motherboard, Monitor monitor, Case theCase) {
		this.motherboard = motherboard;
		this.monitor = monitor;
		this.theCase = theCase;
		
	}
	
	public Motherboard getMotherboard() {
		return motherboard;
	}
	
	public Monitor getMonitor() {
		return monitor;
	}
	
	public Case getTheCase() {
		return theCase;
	}
	
	
}
