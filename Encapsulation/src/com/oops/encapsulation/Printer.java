package com.oops.encapsulation;

public class Printer {
	private int tonerLevel;
	private int numberOfPagesPrinted;
	private boolean isDuplexPrinter;
	
	public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplexPrinter) {
		if(tonerLevel < 0) {
			this.tonerLevel = -1;
		}
		else {
			this.tonerLevel = tonerLevel;
		}
		this.numberOfPagesPrinted = numberOfPagesPrinted;
		this.isDuplexPrinter = isDuplexPrinter;
	}
	
	public void fillToner(int tonerPouredIn) {
		this.tonerLevel = this.tonerLevel + tonerPouredIn;
		if(tonerLevel >= 100) {
			System.out.println("Toner level is at " + tonerLevel + " and has reached it's maximum capacity");
		}
	}
	
	public int printPages() {
		return numberOfPagesPrinted;
	}
	
	public int getTonerLevel() {
		return this.tonerLevel;
	}

}
