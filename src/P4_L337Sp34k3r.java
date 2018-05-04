import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P4_L337Sp34k3r {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("L337 Translator");
		System.out.print("Please enter your three words to make L337: ");
		String wordone = console.nextLine();
		String wordtwo = console.nextLine();
		String wordthree = console.nextLine();
		System.out.println(wordone + " -> " + L337Translator(wordone));
		System.out.println(wordtwo + " -> " + L337Translator(wordtwo));
		System.out.println(wordthree + " -> " + L337Translator(wordthree));
		console.close();
	}
	
	public static String L337Translator(String word) {
		String updatedWord = word
				.toUpperCase()
				.replace('A', '4')
				.replace('E', '3')
				.replace('T', '7')
				.replace("O", "()");
		return updatedWord;
	}

}