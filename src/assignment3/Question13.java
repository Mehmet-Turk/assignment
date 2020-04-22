package assignment3;

import java.util.Scanner;

public class Question13 {
	public static void main(String[] args) {
		/* Ask user to enter a number for price of a shirt. If it is greater than or equal 
		 * to $100,  output will be “Expensive” If it is greater than $70, output will be
		 *  “Not Expensive.”  Otherwise, output will be “Cheap”		 * 
		 */
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter the price of the shirt");
			int price = scan.nextInt();
			if (price >= 100) {
				System.out.println("Expensive");
			}else if (price > 70) {
				System.out.println("Not Expensive");
			}else {
				System.out.println("Cheap");
			}
	}
	

}
