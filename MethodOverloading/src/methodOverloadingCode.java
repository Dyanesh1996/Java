//Same method name just different paramerters.

//println method in java is the classic example of method overloading as we can give all kinds of parameters like int, double, string



public class methodOverloadingCode {

	public static void main(String[] args) {
		
		int newScore = calculateScore("Dnyanesh", 100);
		System.out.println("New score is : " + newScore);
		calculateScore(78);
		calculateScore();
	}
	
	
	public static int calculateScore(String PlayerName, int score) {
		System.out.println("Player " + PlayerName + " scored " + score + " points");
		return score * 1000;
	}
	
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player "+ "scored " + score + " points");
		return score * 1000;
	}
	
	
	public static int calculateScore() {
		System.out.println("No player name,no player score");
		return 0;
	}
}