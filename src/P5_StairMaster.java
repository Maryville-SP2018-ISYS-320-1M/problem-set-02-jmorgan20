import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P5_StairMaster {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many stairs in your staircase?");
		int stairs = console.nextInt();
		System.out.print("How wide should each stair be?");
		int width = console.nextInt();
		
		for(int currentStep = 1; currentStep <= stairs; currentStep++) {
			
			System.out.print("**");
			
			for(int i = 0; i < currentStep - 1; i++ ) {
				
				for(int n = 0; n < width; n++) {
					
					System.out.print(" ");
				}
			}
			for(int i = 0; i < width; i++) {
				
				System.out.print("*");
			}
			System.out.println();
			System.out.print("**");
			for(int i = 0; i < currentStep - 1; i++ ) {
				
				for(int n = 0; n < width; n++) {
					
					System.out.print(" ");
				}
			}
			for(int i = 0; i < width; i++) {
				
				System.out.print("*");
			}
			System.out.println();

				
		}

	}

}