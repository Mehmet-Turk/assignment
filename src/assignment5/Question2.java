package assignment5;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		/*Ask user to enter a password which has two words and a space  between the words. 
		 * Change the initials of the words to “ * ”      
		 * Output should be like: *ohn *alker  
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two words seperated by a space");
		String word = scan.nextLine();
		int idx = word.indexOf(" ");
		String str1 = word.substring(0, 1).replaceAll("\\w", "*") + word.substring(1, idx);
		
		String str2 = word.substring((idx+1), idx+2).replaceAll("\\w", "*") + word.substring(idx+2);
		System.out.println(str1 +" "+ str2);
	
		
	}

}
