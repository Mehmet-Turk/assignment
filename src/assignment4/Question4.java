package assignment4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		/*Ask user to enter a two digits integer. If the sum of the digits of the integer 
		 * is divisible by 3, output will be “The number is divisible by 3.” Otherwise, 
		 * the output will be “This number is not Divisible by 3.” Solve by using if statement.		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a two digit number");
		byte number= scan.nextByte();
		byte firstDigit = (byte) (number % 10);
		byte lastDigit = (byte) (number /10);
		byte sum = (byte) (firstDigit + lastDigit);
		if (sum % 3 == 0) {
			System.out.println("This number is Divisible by 3.");
		}else {
			System.out.println("This number is not Divisible by 3.");
		}
		
	}

}
