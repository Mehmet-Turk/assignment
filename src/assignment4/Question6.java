package assignment4;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		/*Ask user to enter a character. If it is upper case, output will be “Upper case” Otherwise,  
		 * the output will be “Lower case” Solve by using if statement. 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a character");
		char chr = scan.next().charAt(0);
		if (chr >'A' && chr <'Z'){
			System.out.println("Upper case");
		}else {
			System.out.println("Lower case");
		}
	}

}
