package assignment5;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		/*Ask user to enter a starting and an ending value, then print the product of all  
		 * integers from starting value to ending value on the console.  
		 * If the starting value is 5 and ending value is 9, output will be 
		 * 15120 because 5x6x7x8x9=15120 
		 * 
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a starting value");
		int starting = scan.nextInt();
		System.out.println("Please enter a ending value");
		int ending = scan.nextInt();
		int product = 1;
		for (int i = starting; i <= ending;i++) {
			product *= i;
			
		}
		System.out.println("The product of numbers between starting and ending numbers is: " + product);
	}

}
