package com.Udemy.Generics;

public class MainOfGames {

	public static void main(String[] args) {
		FootballPlayer Joe = new FootballPlayer("Joe");
		BaseballPlayer John = new BaseballPlayer("John");
		CricketPlayer Steve = new CricketPlayer("Steve");	
		
		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");		//parameter should always be a class and not primitive type
		adelaideCrows.addPlayer(Joe);
		//adelaideCrows.addPlayer(John);
		//adelaideCrows.addPlayer(Steve);
		
		System.out.println(adelaideCrows.numPlayers());
		
		Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
		baseballTeam.addPlayer(John); 
		
		Team<CricketPlayer> cricketTeam = new Team<CricketPlayer>("Perth Scorchers");
		cricketTeam.addPlayer(Steve);
		
			
	}

}
