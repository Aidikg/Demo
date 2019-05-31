package ifelsestatements;

import java.util.Scanner;

public class Profile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please create your password");
		String passwd=scan.nextLine();
		
		if(passwd.length()<12 && passwd.length()>5) {
			System.out.println(passwd+"Password created");
		}
		else if(passwd.length()<5) {
			System.out.println("Password too short");
		}
		else {
			System.out.println("Your passwd too long");
		}
		
// Example 1
//		String color="blue";
//       //color.equals("red");
//		int size=color.length();
//		System.out.println(color);
	}
}
