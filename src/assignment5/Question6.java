package assignment5;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		/*Ask user to enter a starting and an ending value, then print the sum of all integers  
		 * from starting value to ending value on the console.  
		 * If the starting value is 5 and ending value is 11, 
		 * 
		 * output will be 56 because 5+6+7+8+9+10+11=56 
		 * 
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a starting value");
		int starting = scan.nextInt();
		System.out.println("Please enter a ending value");
		int ending = scan.nextInt();
		int sum = 0 ;
		
		for (int i = starting;i<=ending;i++) {
			sum += i;
			
		}
		System.out.println("The sum of numbers between starting and ending numbers is " + sum);
	}

}
