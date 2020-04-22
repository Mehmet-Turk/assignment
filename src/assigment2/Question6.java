package assigment2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter second to be converted to hour:");
		float second = scan.nextFloat();
		System.out.println("The hour equal is:" + second /60/60);
	}

}
