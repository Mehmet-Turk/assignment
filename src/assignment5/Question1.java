package assignment5;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter his/her first name, last name, and gender. a)Make all
		 * characters of first name uppercase b)Make initial of the last name uppercase,
		 * all other characters lowercase c)Change all characters of the gender to � * �
		 * Output should be like: JOHN Walker ****
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first name");
		String firstName = scan.next();
		System.out.println("Please enter your last name");
		String lastName = scan.next();
		System.out.println("Please enter your gender");
		String gender = scan.next();
		String updatedFirstName = firstName.toUpperCase();
		String updatedLastName = lastName.substring(0, 1).toUpperCase()+ lastName.substring(1).toLowerCase();
		String updatedGender = gender.replaceAll("\\S", "*");
		System.out.println(updatedFirstName + " "+ updatedLastName +" "+ updatedGender);
		
	}

}
