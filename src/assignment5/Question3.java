package assignment5;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		/*Ask user to enter his/her first name, last name, 
		 * and gender and “ _ ”  between the words. Change all “ _ ” to “ / ”  
		 * and all letters to “ * ”  Output should be like: ****//**** 
		 * */
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your first lastname and gender seperated by _");
		String code = scan.next();
		String str1 = code.replaceAll("_", "/").replaceAll("\\w", "*");
		System.out.println(str1);
		
	}

}
