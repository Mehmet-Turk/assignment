package assigment2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the price of the material witout any discount:");
		float f = scan.nextFloat();
		float f1 = f-(f *60/100);
		System.out.println("The price wtih the additional discount is:"+ (f1- (f1 * 30/100)) );
	}

}
