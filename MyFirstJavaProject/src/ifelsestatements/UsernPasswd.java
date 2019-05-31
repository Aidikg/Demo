package ifelsestatements;

import java.util.Scanner;

public class UsernPasswd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String username="test";
		String password="test123";
		
		System.out.println("Please enter your username");
		String usern=scan.nextLine();
		System.out.println("Please enter your password");
		String passwd=scan.nextLine();
		
		if(usern.equals(username) && passwd.equals(password)) {
			System.out.println("Welcome "+usern+" !!!");
		}
		else if(usern.equals(username) && !passwd.equals(password)) {
			System.out.println("Password Incorrect");
		}
		else if(!usern.equals(username)&& passwd.equals(password)) {
			System.out.println("Username Incorrect");
		}
		else {
			System.out.println("Invalid Credentials");
		}
		
		
	}
}
