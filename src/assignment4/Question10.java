package assignment4;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		/*Ask user to enter two words. If the length of the first and the second 
		 * words are equal, output will be “Equal length.” Otherwise,  the output will be 
		 * “Not equal length” Solve by using if statement. 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String word1 = scan.next();
		System.out.println("Enter a word");
		String word2 = scan.next();
		if (word1.length() == word2.length()) {
			System.out.println("Equal lenght");
		}else {
			System.out.println("Not equal lenght");
		}
	}

}
