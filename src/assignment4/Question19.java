package assignment4;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		/*Ask user to enter one of the first three letters of the alphabet.
		 *  Output will be the order number of the letter in the alphabet. 
		 *  For example If user enters ‘a’ output will be 1. Your code should run for 
		 *  both upper cases and lower cases. Solve by using switch. 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter one of the first 3 letters");
		char letter = scan.next().charAt(0);
		switch (letter) {
		case 'A':
			System.out.println("1");			
			break;
		case 'a':
			System.out.println("1");
			break;
		case 'B':
			System.out.println("2");
			break;
		case 'b':
			System.out.println("2");
			break;
		case 'C':
			System.out.println("3");
			break;
		case 'c':
			System.out.println("3");
			break;		
		default:
			System.out.println("irrelevant letter");
			break;
		}
		
		
	}

}
