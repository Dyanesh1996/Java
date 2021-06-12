
public class CodingChallenePlayingCat {

	public static void main(String[] args) {
			System.out.println(PlayingCat(true, 27));
			System.out.println(PlayingCat(false, 30));
			System.out.println(PlayingCat(false, 70));
		
	}
	public static boolean PlayingCat(boolean summer, int temperature) {
		
		if (summer == true) {
			if(temperature >=25 && temperature <=35) {
				
				return true;
				
			}else { 
				return false;
			}
			
		}else {
			if(temperature>=25 && temperature <=35) {
				return true;
				
			}else {
				return false;
				
			}	
		}
	}
}
