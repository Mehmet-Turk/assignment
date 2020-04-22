package assigment2;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your budject:");
		int mny = scan.nextInt();
		System.out.println("Please enter price of wing");
		int wing = scan.nextInt();
		System.out.println("You can buy " + (mny/wing) + " wings" + " and " + (mny%wing) + " $ left");
	}

}
