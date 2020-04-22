package assignment4;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		/*Ask user to enter an integer. If the integer is divisible by 5, output will be 
		 * “Divisible by 5”, 
		 * Otherwise, output will be “Not divisible By 5” Solve by using if-else if(). 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int num = scan.nextInt();
		int lastDigit = num % 10;
		if (lastDigit == 0) {
			System.out.println("Divisible by 5");
		}else if (lastDigit == 5) {
			System.out.println("Divisible by 5");
		}else {
			System.out.println("not divisible by 5");
		}
	}

}
