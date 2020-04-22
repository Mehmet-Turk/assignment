package assigment2;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter 3 digit number");
		int i = scan.nextInt();
		int birler = i % 10;
		int onlar = (i %100)/10;
		int yuzler = i / 100;
		System.out.println(yuzler + birler + onlar);
	}

}
