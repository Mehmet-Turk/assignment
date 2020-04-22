package assignment3;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		/* Ask user to enter an integer. If the number has 3 digits, output will be  
		 * “This number has 3 digits.” Otherwise, output will be “This number has 
		 * no 3 digits.”
		 * 
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a integer");
		int num = scan.nextInt();
		if (num > 99 && num < 1000) {
			System.out.println("This number is 3 digit number");
		}else {
			System.out.println("This number is not 3 digit number");
		
		}
		
		
	}

}
