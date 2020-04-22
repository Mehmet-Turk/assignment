package assignment1;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter hour to be converted to second");
		long hour = scan.nextLong();
		System.out.println("It is " + hour * 60 * 60 + " seconds");
	}

}
