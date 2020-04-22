package assignment3;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		/*Ask user to enter a char. If user entered an upper case letter then check 
		 * if it is ‘A’ or ‘B’, output will be  “You entered an upper case letter 
		 * and it is one of the first two upper cases.” If user entered a lower case letter  
		 * then check if it is ‘y’ or ‘z’, output will be “You entered an lower case letter 
		 * and it is one of the last  two lower cases.”Otherwise, output will be “I do not know 
		 * that char.
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a charecter");
		char letter = scan.next().charAt(0);
		if ((letter >= 'A' && letter <= 'Z')) {
			
			if (letter == 'A' || letter == 'B') {
					System.out.println("You entered an upper case letter and it is one of the first two upper cases.");
				}else {
					System.out.println("I do not know that char.");
				}
		}				
		if ((letter >= 'a' && letter <= 'z')) {
			if (letter == 'y' || letter == 'z') {
				System.out.println("You entered an lower case letters and it is one of the last  two lower cases.");
			}else {
				System.out.println("I do not know that char.");
			}
		}
			
	}	

}
