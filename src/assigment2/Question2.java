package assigment2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enre two integers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("The addition of entered numbers is:" + (num1 + num2));
		System.out.println("The subtraction of two entered numbers is:" + (num1 - num2));
		System.out.println("The multiplication of two entered numbers is:" + (num1 * num2));
		System.out.println("The division of two entered numbers is:" + (num1 / num2));
		
	}

}
