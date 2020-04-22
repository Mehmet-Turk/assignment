package assignment3;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// Ask user to enter any number. If it is integer, output will be “This is integer.”
		//Otherwise, output will be  “This is not integer.”
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		double num = scan.nextDouble();
		int intOfDouble = (int) num;
		if (num == intOfDouble) {
			System.out.println("This is an integer number");
		}else {
			System.out.println("This is not an integer number");
		}

	}

}
