package tasks;
//import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class FindEvenOdd {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your guess number 0-10: ");
		int num=input.nextInt();
		
		// boolean found=false;  // for second Ex
		
		Random rand=new Random();
		int random=rand.nextInt(10);
		
		if(num==random) {
			System.out.println("Congratulations");
		}
		else if(num<random) {
			System.out.println("Too low");
			System.out.println("Try again");
			
			int num2=input.nextInt();
			Random rand2=new Random();
			int random2=rand.nextInt(10);
			if(num2==random) {
				System.out.println("Conguratulations");
			}
			else {
				System.out.println("You lost");
			}
		}
		else {
			System.out.println("too high");
			System.out.println("Try again");
			
			int num3=input.nextInt();
			Random rand3=new Random();
			int random3=rand.nextInt(10);
			
			if(num3==random) {
				System.out.println("Conguratulations");
			}
			else {
				System.out.println("You lost");
			}
		}
		System.out.println("Secret number is "+ random);
		
		//Example top with different way 
		/*
		 * 
		 */
		
		
		// example 1
//		int remainder=random % 2;
//		
//		if(remainder==0) {
//			System.out.println("Even");
//		}
//		else {
//			System.out.println("Odd");
//		}
	}
}
