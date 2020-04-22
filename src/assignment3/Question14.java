package assignment3;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		/* Ask user to enter 3 integers. If user entered them in ascending order, 
		 * output will be  “Good Job, the numbers are in ascending order.” 
		 * If user entered them in descending order, output will be  
		 * “Good Job, the numbers are in descending order.” Otherwise, 
		 * output will be “Put them in order”		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 integers");
		int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt();
		if (num1 > num2 && num1>num3 && num2> num3) {
			System.out.println("Good Job, the numbers are in ascending order.");
		}else if (num1 < num2 && num1 < num3 && num2<num3) {
			System.out.println("Good Job, the numbers are in descending order.");
		}else {
			System.out.println("Put them in order");
		}
	}

}
