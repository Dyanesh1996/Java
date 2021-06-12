package com.Udemy.Abstraction;

public class MainOfAnimalDogBird {

	public static void main(String[] args) {
		Dog dog = new Dog("Yorkie");
		dog.breathe();
		dog.eat();
		
		Bird bird = new Bird("Parrot");
		bird.eat();
		bird.breathe();
		bird.fly();
	}

}
