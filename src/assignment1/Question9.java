package assignment1;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String firstName = scan.nextLine();
		System.out.println("Please enter your last name: ");
		String lastName = scan.nextLine();
		System.out.println("Please enter your address: ");
		String address = scan.nextLine();
		System.out.print("Your full name is : " +firstName + " ");
		System.out.println(lastName);
		System.out.println("Your address is: " + address);
	
	}

}
