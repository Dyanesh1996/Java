package com.oops.composition;

public class Wardrobe {
	
	private int tees;
	private int formals;
	private int casuals;
	private int shorts;
	
	
	public Wardrobe(int tees, int formals, int casuals, int shorts) {
		this.tees = tees;
		this.formals = formals;
		this.casuals = casuals;
		this.shorts = shorts;
	}


	public int getTees() {
		return tees;
	}


	public int getFormals() {
		return formals;
	}


	public int getCasuals() {
		return casuals;
	}


	public int getShorts() {
		return shorts;
	}
	

	
}

