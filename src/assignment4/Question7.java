package assignment4;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		/*Ask user to enter a character. If it is upper case, output will be “Upper case” 
		 * Otherwise,  the output will be “Lower case” Solve by using ternary.		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a character");
		char chr = scan.next().charAt(0);
		System.out.println(chr > 'A' && chr <'Z' ? "Upper case" : "Lower Case");
	}

}
