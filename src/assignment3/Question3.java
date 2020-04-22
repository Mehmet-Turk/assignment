package assignment3;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		/* Ask user to enter a String. If the first letter of the String is “A”, 
		 * output will be “This String is starting with ‘A’.” Otherwise, output will be 
		 * “This String is not starting with ‘A’.”
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = scan.next();
		char firstLetter = word.charAt(0);
		if (firstLetter == 'A') {
			System.out.println("This string is starting with 'A'");
		}else {
			System.out.println("This String is not starting with 'A'");
		}
	}

}
