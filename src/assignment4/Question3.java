package assignment4;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		/*Ask user to enter a three digits integer. If the first and last digits of the number 
		 *  are same out put will be “Mirror number.” If all digits are same, output will be
		 *  “Perfect number.” Otherwise, output will be “Ordinary number.” 
		 *  Solve by using if - else if() statement.		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 digit number");
		String number = scan.next();
		char firstDigit = number.charAt(0);
		char lastDigit = number.charAt(2);
		char middleDigit = number.charAt(1);
		if (firstDigit == lastDigit && middleDigit != firstDigit) {
			System.out.println("Mirror number.");
		}else if (firstDigit == lastDigit && lastDigit == middleDigit) {
			System.out.println("Perfect number.");
		}else {
			System.out.println("Ordinary number.");
		}
		
		
	}

}
