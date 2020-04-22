package assignment4;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		/*Ask user to enter his first and last name. If the both initials are upper cases  
		 * output will be “True”, otherwise output will be “False.” Solve by using ternary		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your firsts name");
		String firstName = scan.next();
		System.out.println("Please enter your last name");
		String lastName = scan.next();
		String result = (firstName.charAt(0)>'A' && firstName.charAt(0)<'Z')&&(lastName.charAt(0)>'A' && lastName.charAt(0)<'Z') ? "True" : "False";
		System.out.println(result);
	}

}
