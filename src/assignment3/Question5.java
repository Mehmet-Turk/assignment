package assignment3;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		/* Ask user to enter a String. If the first letter of the String is “Z” and 
		 * if it has more than 4 characters output will be “Good String.” Otherwise, 
		 * output will be “Bad String”		 * 
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a word");
		String word = scan.next();
		char lastLetter = word.charAt(3);
		if(lastLetter == 'Z' && word.length() == 4) {
			System.out.println("Good String");
		}else {
			System.out.println("Bad String");
		}
	}

}
