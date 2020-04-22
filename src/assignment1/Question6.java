package assignment1;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter mile to be converted to km as double : ");
		double mile = scan.nextDouble();
		System.out.println("It is " + mile * 1.6 + " km");
	}

}
