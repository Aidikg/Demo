package ifelsestatements;

import java.util.Scanner;

public class Profile2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please create password");
		String passwd=input.nextLine();
		
		if(passwd.length()>=5 && passwd.length()<=12) {
			System.out.println(passwd+" passwd created");
		}
		else{
			if(passwd.length()<5) {
				System.out.println("Password length too short");
			}
			else {
				System.out.println("Password length too long");
			}
		}
	}
}
