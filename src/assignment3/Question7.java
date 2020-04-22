package assignment3;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		/*Ask user to enter 2 names together with their birth years. 
		 * Print their names on the console  from young to old.		 * 
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter name");
		String firstName = scan.next();
		System.out.println("Please enter birth year");
		int firstBirthYear = scan.nextInt();
		System.out.println("Please enter second name");
		String secondName = scan.next();
		System.out.println("Please enter second birth year");
		int secondBirthYear = scan.nextInt();
		if (firstBirthYear < secondBirthYear) {
			System.out.println(firstName);
			System.out.println(secondName);
		}else {
			System.out.println(secondName);
			System.out.println(firstName);
		}
		
	}

}
