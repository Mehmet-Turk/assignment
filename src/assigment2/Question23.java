package assigment2;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number");
		int i = scan.nextInt();
		if (i%5 == 0) {
			System.out.println(" The number is divisible by 5");
		}
		if (i % 5 != 0) {
			System.out.println("The number is not divisible by 5");
		}
	}

}
