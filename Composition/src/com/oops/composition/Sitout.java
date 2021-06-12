package com.oops.composition;

public class Sitout {
	private String swing;
	private int table;
	private Plants plants;
	
	public Sitout(String swing, int table, Plants plants) {
		super();
		this.swing = swing;
		this.table = table;
		this.plants = plants;
	}
	
	public void enjoyTheCoffeeWithView() {
		System.out.println("Enjoyy!!!");
	}
	
	
	
}
