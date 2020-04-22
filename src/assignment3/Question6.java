package assignment3;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		/*Ask user to enter a String. If the first letter of the String is “A” or
		 *  if it has less than 4 characters output will be “Weird String.” Otherwise, 
		 *  output will be “Normal String”		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = scan.next();
		char firstLetter = word.charAt(0);
		if (firstLetter == 'A' || word.length()<4) {
			System.out.println("Wierd String");
		}else {
			System.out.println("Normal String");
		}
		
	}

}
