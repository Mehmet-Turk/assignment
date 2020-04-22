package assignment4;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		/*Ask user to enter a two digits integer. If the sum of the digits of the 
		 * integer is divisible by 3, output will be “The number is divisible by 3.” 
		 * Otherwise, the output will be “The number is divisible by 3..” Solve by using ternary.		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a two digit number");
		byte number= scan.nextByte();
		byte firstDigit = (byte) (number % 10);
		byte lastDigit = (byte) (number /10);
		byte sum = (byte) (firstDigit + lastDigit);
		System.out.println(sum % 3 == 0 ? "The number is divisible by 3." : "The number is divisible by 3.");
	}

}
