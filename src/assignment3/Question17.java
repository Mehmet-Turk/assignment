package assignment3;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		/*Ask user to enter 3 chars. If user entered them in alphabetical order, 
		 * output will be  “Good Job, the chars are in alphabetical order.” 
		 * If user entered just first two in alphabetical order,  output will be 
		 * “Just first two chars are in alphabetical order.” Otherwise, output will be 
		 * “Put them in order”		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 charecter");
		char firstLetter = scan.next().charAt(0), secondLetter = scan.next().charAt(0);
		char thirdLetter = scan.next().charAt(0);
		if ((firstLetter < secondLetter && firstLetter < thirdLetter)&& (secondLetter < thirdLetter)) {
			System.out.println("Good Job, the chars are in alphabetical order.");
		}else if (firstLetter < secondLetter && firstLetter > thirdLetter ) {
			System.out.println("Just first two chars are in alphabetical order.");
		}else {
			System.out.println("Put them in order");
		}
		
	}

}
