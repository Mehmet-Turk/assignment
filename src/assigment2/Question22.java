package assigment2;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter a number");
		int i = scan.nextInt();
		if (i%2==0) {
			System.out.println("the number is even");
		}
		if (i%2==1) {
			System.out.println("the number is odd");
		}
	}

}
