package assigment2;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int i = scan.nextInt();
		if (i > 300) {
			System.out.println("The number is greater than 300");
		
		}
		if (i <300 ) {
			System.out.println("The number is not greater than 300");
		}
	}

}
