package assignment3;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		//Ask user to enter three integers. Print them on the console in ascending order.
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a integer");
		int num1 = scan.nextInt();
		System.out.println("please enter a integer");
		int num2 = scan.nextInt();
		System.out.println("please enter a integer");
		int num3 = scan.nextInt();
		if ((num1 > num2 && num1 > num3) && (num2>num3)) {
			System.out.println("The ascending order is " + num3+ " " + num2+ " " + num1);			
		}else {
			System.out.println("The ascending order is " + num2+ " " + num3 + " " + num1);
		}
		if ((num2 > num3 && num2 > num1) && (num1>num3)) {
			System.out.println("The ascending order is " + num3 + " " + num1+ " " + num2);	
		}else {
			System.out.println("The ascending order is " + num1 + " " + num3+ " " + num2);
		}
	}

}
