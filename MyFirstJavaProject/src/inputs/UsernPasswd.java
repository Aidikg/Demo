package inputs;

import java.util.Scanner;

public class UsernPasswd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your Username and Password");
		String username=sc.nextLine();
		//sc.nextLine();
		String passwd=sc.nextLine();
		System.out.println("Username: "+ username);
		System.out.println("Password: "+ passwd);
	}
}
