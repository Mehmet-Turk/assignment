package assignment5;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		/*Ask user to enter his/her first name, then change every letter to the next letter. 
		 * (First name should not contain the letter “Z” or “z”) 
		 * If the first name is Abc output will be Bcd
		 * 
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your name not contains z");
		String name = scan.next();		
		boolean isTrue = name.contains("z") || name.contains("Z");
		String named = "";
		int lenght = name.length();
		char count;
		if (isTrue) {
			System.out.println("Please enter without Z or z");
		}else {
			for (int i = 0; i <lenght;i++) {
				count = (char) (name.charAt(i)+1);
				named += count;
			}
			System.out.println(named);
		}
		
		
		}
		}
