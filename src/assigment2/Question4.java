package assigment2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println(" Please enter milage as mile:");
		float f = scan.nextFloat();
		System.out.println(" The cost of the trip is:" + ((f/36)*2.5)+"$");
	}

}
