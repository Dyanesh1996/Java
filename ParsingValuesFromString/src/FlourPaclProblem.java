
public class FlourPaclProblem {

	public static void main(String[] args) {
		
		System.out.println(canPack(1, 0, 4));
		System.out.println(canPack(1, 0, 5));
		System.out.println(canPack(2, 2, 11));
		
	}
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
			
			int kilosOfBigCount, kilosOfSmallCount;
			
			kilosOfBigCount = 5 * bigCount ;
			kilosOfSmallCount = 1 * smallCount;
			
			int sumOfKilos = kilosOfBigCount + kilosOfSmallCount;
			
			if(sumOfKilos <= goal) {
				
				System.out.print("Can be packed : ");
				return true;
			}
			
			else if(sumOfKilos > goal) {
				if((goal % kilosOfBigCount) <= kilosOfSmallCount) {
					System.out.print("Can be packed : ");
					return true;
				}
				
			}	
		return false;
		
	}

}
