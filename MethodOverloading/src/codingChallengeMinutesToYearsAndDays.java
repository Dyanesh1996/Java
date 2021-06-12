//Minutes to years and days..Need to revisit this code for logic


public class codingChallengeMinutesToYearsAndDays {

	public static void main(String[] args) {
		printYearsAndDays(1000000L);
		
		
	}

	
	public static void printYearsAndDays(long minutes) {
		
		if(minutes < 0) {
			System.out.println("Invalid Value");
			
		}else {
			
			long years = minutes / 525600;		//an year has 525600 minutes
			
			long days = minutes / 1440;
			long remainingMinutes = days % 525600;
			
			System.out.println(minutes + " min = " + years + "y and " + days + "d");
			
		}
		
	}
}
