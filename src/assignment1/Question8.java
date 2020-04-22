package assignment1;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first name");
		String name = scan.nextLine();
		System.out.println("Please enter your last name");
		String last = scan.nextLine();
		System.out.println("Your full name is " + name + " " + last);
	}

}
