package com.oops.composition;

public class ChallengeMain {

	public static void main(String[] args) {
		
		Wardrobe wardrobe = new Wardrobe(15, 8, 12, 5);
		Room room = new Room(2, 2, 2, wardrobe);
		room.getWardrobe().getShorts();
		
		
		
		Plants plants = new Plants("Orange", "Red", "White with some wow odour");
		Sitout sitout = new Sitout("Jhoka", 1, plants);
		room.getSitout().enjoyTheCoffeeWithView();
		
		
	}

}
