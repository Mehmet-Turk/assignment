package assigment2;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter four digit number:");
		int i = scan.nextInt();
		int binler = i / 1000;
		int yuzler = (i % 1000) / 100;
		int onlar = ((i % 1000)%100)/10;
		int birler = i % 10;
		System.out.println(birler + "" + onlar + yuzler + binler);
		
		/*
		 * Ask user to enter a 4 digit number, then type a program to print
		 * on the console its inverse. Like if user enters 1234, you should 
		 * see on the console 4321 
		 */
	}

}
