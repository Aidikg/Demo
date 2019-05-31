package ifelsestatements;

import java.util.Scanner;

public class FindMaxNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter two different number");
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		if(num1>num2) {
			System.out.println("Max number is "+num1);
		}
		else {
			System.out.println("Max number is "+num2);
		}
		
	}
}
