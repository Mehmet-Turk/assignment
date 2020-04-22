package assignment3;

import java.util.Scanner;

public class Question15 {
	public static void main(String[] args) {
		/*Ask user to enter 2 letters. If user entered two upper case letters, 
		 * output will be  “Good Job, both are upper cases.” If user entered two 
		 * lower case letters, output will be  “Good Job, both are lower cases.” 
		 * Otherwise, output will be “I am confused”		 * 
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter 2Q letters");
		char letter1 = scan.next().charAt(0), letter2 = scan.next().charAt(0);
		if ((letter1 >= 'A' && letter1 <= 'Z') && (letter2 >='A' && letter2 <= 'Z')) {
			System.out.println("Good Job, both are upper cases.");
		}else if ((letter1 >= 'a' && letter1 <= 'z') && (letter2 >='a' && letter2 <= 'z')) {
			System.out.println("Good Job, both are lower cases.");
		}else {
			System.out.println("I am confused");
		}
	}

}
