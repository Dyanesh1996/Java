package com.oops.encapsulation;


//Writing this class without encapsulation to understand why encapsulation is needed

public class PlayerOfNoEncapsulation {
	public String name;
	public int health;
	public String weapon;
	
	public void loseHealth(int damage) {
		this.health = this.health - damage;
		if(this.health < 0) {
			System.out.println("Player knocked out");	//Reduce number of lives remaining for a player
		}
	}
	
	public int healthReamaining() {
		return this.health;
	}
}
