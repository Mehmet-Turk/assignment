package assignment5;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		/*Ask user to enter his/her first name, then print the letters of the 
		 * first name on the console from top to down. If the first name is John 
		 * out put will be like; J o h n 
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your name");
		String name = scan.next();
		//int lenght = name.length();
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
	}

}
