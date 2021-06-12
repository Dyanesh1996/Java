package com.oops.encapsulation;

public class MainOfEncapsulation {

	public static void main(String[] args) {
		PlayerOfEncapsulation player = new PlayerOfEncapsulation("Dnyanesh", 50, "Sniper");
		
		System.out.println("Initial health is : " + player.getHealth());
	}

}
