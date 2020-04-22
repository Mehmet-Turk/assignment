package assignment3;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		/*Ask user to enter a String. If it has more than 7 characters, 
		 * output will be “Good.”  If it has more than 4 characters, 
		 * output will be “Not Bad.” Otherwise, output will be “Bad”		 * 
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a word");
		String word = scan.next();
		if (word.length() > 7 ) {
			System.out.println("Good");
		}else if (word.length()>4) {
			System.out.println("Not bad");
		}else {
			System.out.println("Bad");
		}
	}

}
