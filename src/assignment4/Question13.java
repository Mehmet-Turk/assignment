package assignment4;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		/*Ask user to enter the initials of the day of a week. If the initial is “S”, 
		 * output will be “Saturday, Sunday”, if the initial is “M”  output will “Monday”, 
		 * if the initial is “T” output will be “Tuesday, Thursday”, if the initial is “W” 
		 * output will be “Wednesday”, if the initial is “F” Output will be “Friday.”Otherwise, 
		 * output will be “Not valid initial for the day names” Solve by using if-else if(). 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter initial of a day as upper case");
		char initial = scan.next().charAt(0);
		if (initial == 'S') {
			System.out.println("Saturday, Sunday");
		}else if (initial == 'M') {
			System.out.println("Monday");
		}else if (initial == 'T') {
			System.out.println("Tuesday, Thursday");
		}else if (initial == 'W') {
			System.out.println("Wednesday");
		}else if (initial == 'F') {
			System.out.println("Friday");
		}else {
			System.out.println("Not valid initial for the day names");
		}
	}

}
