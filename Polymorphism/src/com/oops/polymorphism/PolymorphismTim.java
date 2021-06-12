package com.oops.polymorphism;

class Movie{
	private String name;
	public Movie(String name) {
		this.name = name;
	}
	
	public String plot() {
		return "No plot here";
	}

	public String getName() {
		return name;
	}
	
}


class LaLaLand extends Movie {

	public LaLaLand() {
		super("LaLaLand");
	}
	
	public String plot() {
		return "Beautiful story of Mia-Sebastian";
	}
	
}


class WorldWarZ extends Movie{

	public WorldWarZ() {
		super("WorldWarZ");
	}

	@Override
	public String plot() {
		return "Zombies attempt to rule over planet of humans";
	}
	
	
}


class Hachiko extends Movie{

	public Hachiko() {
		super("Hachiko");
	}

	@Override
	public String plot() {
		return "A beaitiful story of a loyal dog";
	}

}


class HarryPotter extends Movie{

	public HarryPotter() {
		super("HarryPotter");
	}

	@Override
	public String plot() {
		return "The famous wizarding fandom";
	}
}


class SampleMovie extends Movie{
	public SampleMovie() {
		super("SampleMovie");
	}
	//No plot method for this class
}






public class PolymorphismTim {

	public static void main(String[] args) {
		
		for(int i = 1; i < 11; i++ ) {
			Movie movie = randomMovie();
			System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot : " + movie.plot() + "\n");
		}

		
	}
	
	
	public static Movie randomMovie() {
		int randomNumber = (int) (Math.random() * 5) + 1;
		System.out.println("Random number generated was : " + randomNumber);
		
		switch(randomNumber) {
			case 1: 
				return new LaLaLand();
		
			case 2:
				return new WorldWarZ();
				
			case 3:
				return new Hachiko();
				
			case 4: 
				return new HarryPotter();
				
			case 5: 
				return new SampleMovie();
		}
		return null;
	} 
	
	
	
	
	
	

}
