import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P1_NumbersRightMethod {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.print("How many lines would you like to print? ");
		int height = console.nextInt();
		
		for (int row = 1; row <= height; row++) {
			for (int space = 1; space <= row * -1 + height; space++) {
				System.out.print(" ");
			}
			for(int number = 1; number <= row; number++) {
				System.out.print(row);
			}
			System.out.println();
		}
		
		console.close();
	}

}