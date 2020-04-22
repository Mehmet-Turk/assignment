package assignment5;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		/*Ask user to enter a starting and an ending value, then print all even integers  
		 * from starting value to ending value on the console in the same line.
		 *  Put a space  between the numbers. 
		 *  If the starting value is 5 and ending value is 11, output will be like: 6 8 10
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter starting point");
		int starting = scan.nextInt();
		System.out.println("Please enter ending point");
		int ending = scan.nextInt();
		for (int i = starting; i <=ending;i++) {
			if (i %2 == 0) {
				System.out.print(i +" ");
			}
		}
	}

}
