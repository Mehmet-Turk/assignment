package assignment3;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		/* Ask user to enter a his/her name. If its length is more than 4 then check 
		 * if its first char is upper case letter, output will be  “Good.” If its length is less 
		 * than 4 then check if its first char is lower case letter, output will be  “Not Bad.” 
		 * Otherwise, output will be “I did not like that name.” 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.next();
		int lenght = name.length();
		char firstLetter = name.charAt(0);
		
		if (lenght > 4) {
			if (firstLetter > 'A' && firstLetter < 'Z') {
				System.out.println("Good");
			}else {
				System.out.println("Not bad");
			}
		}else {
			System.out.println("I did not like that name.");
		}
	}

}
