package com.oops.encapsulation;

public class MainOfNoEncapsultion {

	public static void main(String[] args) {
		
		PlayerOfNoEncapsulation player =  new PlayerOfNoEncapsulation();
		player.name = "Dnyanesh";
		player.health = 20;
		player.weapon = "Shotgun";
		
		
		int damage = 10;
		player.loseHealth(damage);
		System.out.println("Remaining health : " + player.healthReamaining());
		
		
		damage = 11;
		player.loseHealth(damage);
		System.out.println("Remaining health : " + player.healthReamaining());
		
		
	}

}
