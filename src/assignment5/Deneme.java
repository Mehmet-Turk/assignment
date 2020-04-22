package assignment5;

import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		//a + 2 n-1Xb
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a");
		int a = scan.nextInt();
		System.out.println("Enter n");
		int n = scan.nextInt();
		System.out.println("Enter b");
		int b = scan.nextInt();
		int sum = a+b,count=1;
		System.out.println(sum);
		for(int i =0;i <n-1;i++) {
			count *= 2;
			//System.out.println(count);
			sum = sum + count*b;
			System.out.println(sum);
		}
			
		

	}

}
