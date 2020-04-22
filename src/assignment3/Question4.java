package assignment3;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// Ask user to enter 2 chars in upper case. Print them on the console in 
		//alphabetical order. 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a upper case letter");
		char letter1 = scan.next().charAt(0);
		System.out.println("Please enter another upper case letter");
		char letter2 = scan.next().charAt(0);
		if (letter1 > letter2) {
			System.out.println("Alphabetical order is " + letter2 + " "+letter1);
		}else {
			System.out.println("Alphabetical order is " + letter1 + "0" + letter2);
		}
	}

}
