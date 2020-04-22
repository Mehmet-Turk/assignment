package assignment5;

import java.util.Scanner;

public class Question9Interview {

	public static void main(String[] args) {
		/*Ask user to enter his/her last name, then print its inverse on the console. 
		 * (Interview Question)  
		 * If the last name is Walker output will be reklaW 
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your last name");
		String lastName = scan.next();
		int lenght = lastName.length()-1;
		String updatedLastName = "";
		for (int i = lenght; i >=0;i--) {
			updatedLastName += lastName.charAt(i);
		}
		System.out.println(updatedLastName);
	}

}
