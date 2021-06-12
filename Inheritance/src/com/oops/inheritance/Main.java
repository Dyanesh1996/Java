package com.oops.inheritance;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		
		Dog dog = new Dog("Retriever", 8, 20, 2, 4, 1, "long silky");
		
		Fish fish = new Fish("Goldfish", 5, 8, 2, 3, 2);
		
		dog.eat();
		
		dog.walk();
		dog.run();
		fish.swim(50);
		
		
	}

}
