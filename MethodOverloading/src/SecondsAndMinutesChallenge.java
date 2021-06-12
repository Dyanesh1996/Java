
public class SecondsAndMinutesChallenge {

	public static void main(String[] args) {
			
		getDurationString(100, 50);		// u can put this method call in SOP also like below
		//System.out.println(getDurationString(100, 50));
		
		getDurationString(4000);
		
	}
	
	public static String getDurationString(int minutes, int seconds) {
		
		if(minutes < 0 || seconds <0 || seconds >59) {
			System.out.println("Invalid Value");
			return "Invalid value";
		}
		
		else
		{
			int Hours = minutes / 60;
			int remainingMinutes = minutes % 60;
			
			System.out.println(Hours + "h " + remainingMinutes + "m " + seconds + "s ");
			return Hours + "h" + remainingMinutes + "m" + seconds + "s";
		}
		
			
	}
	public static String getDurationString(int seconds) {
		
		if(seconds < 0) {
			return "Invalid Value";
		}
		else {
			int minutes = seconds / 60;
			int remianingSeconds = seconds % 60;
			
			return getDurationString(minutes, remianingSeconds);
			
		}
		
	}
	
}
