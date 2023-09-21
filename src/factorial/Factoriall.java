package factorial;

import java.util.Scanner;

public class Factoriall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = sc.nextInt();
		int factorial = 1;
		if (number < 0) {
			System.out.println("Number must be a positive integer.");
		} 
		else if(number >= 0) {
		for(int i = 1; i <= number; i++) {
			factorial = factorial * i;
			
		}
		System.out.println("Result: " + factorial);
		}
		

	}

  }