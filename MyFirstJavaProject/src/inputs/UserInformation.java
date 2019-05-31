package inputs;

import java.util.Scanner;

public class UserInformation {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String fname, lname, address;
		int creditCard;
		
		System.out.println("Please enter your information about: ");
		System.out.print("firstname: ");
		fname=sc.nextLine();
		System.out.print("lastname: ");
		lname=sc.nextLine();
		System.out.print("address: ");
		address=sc.nextLine();
		System.out.print("credit card: ");
		creditCard=sc.nextInt();
		
		sc.nextLine();
		System.out.println();
		System.out.println("Information you entered");
		System.out.println("Name: "+fname+" "+lname);
		System.out.println("Address: "+address);
		System.out.println("CC Number: "+ creditCard);
		
		System.out.println("Save now? ");
		System.out.println("Yes \nNo");
		String ans=sc.nextLine();
		System.out.println(ans);
		
		System.out.println("Thank you!");
		
		
	}
}
