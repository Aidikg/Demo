package ifelsestatements;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
//Example 3
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome. Please enter your age:");
		int age = input.nextInt();
		
		if(age > 0 && age <=120) {
			System.out.println("valid age");
			if(age >= 21) {
				System.out.println("Welcome to Club");
			}
			else {
				System.out.println("Not enough age!");
				int difference = 21 - age;
				System.out.println("Please come back after " + difference + " years");
			}
		}
		else {
			System.out.println("invalid age");
		}
		
// Example 2
//		Scanner scan=new Scanner(System.in);
//		int age=scan.nextInt();
//		System.out.println("Please, enter your age");
//		if(age >= 21) {
//			System.out.println("Welcome to Club");
//		} else {
//			int diff=21-age;
//			System.out.println("Not enough age!");
//			System.out.println("Please come back after "+diff+" years");
//		}
		
		
//      Example1		
//		int age=19;
//		if(age>=21) {
//			System.out.println("Welcome to Club");
//		} else {
//			System.out.println("Not enough age! ");
//			
//			int sum = 21-age;
//			
//			System.out.println("Please come back after "+sum +" years");
//		}
	}
}
