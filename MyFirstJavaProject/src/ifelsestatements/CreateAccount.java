package ifelsestatements;

import java.util.Scanner;

public class CreateAccount {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String username1="test";
		String username2="james";
		
		System.out.println("Please enter your username");
		String user=scan.nextLine();
		
		// Create account
		if(user.equals(username1) || user.equals(username2)) {
			System.out.println("username taken");
		}
		else {
			System.out.println("username created");
			
			System.out.println("Create your password");
			String passwd=scan.nextLine();
			int len=passwd.length();
			
			if(len >= 5 && len <=12) {
				System.out.println("Your passwd is created");
			}
			else {
				System.out.println("Invalid passwd");
			}
			System.out.println("Your username is: "+user);
			System.out.println("Your password is: "+ passwd);
		}
		
		// Create Password
		
		
		
		System.out.println("End of program");
	}
}
