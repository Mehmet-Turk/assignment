package assigment2;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter day to reach your goal:");
		int day = scan.nextInt();
		int hour = day * 24;
		int minute = hour * 60;
		int second = minute * 60;
		System.out.println("You have "+ hour  +" hour!");
		System.out.println("You have " + minute + " minute!" );
		System.out.println("You have " + second + " second");
		
	}

}
