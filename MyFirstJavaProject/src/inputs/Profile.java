package inputs;

import java.util.Scanner;

public class Profile {

	public static void main(String[] args) {
		System.out.println("Welcome to my Program!");
		String firstName;
		String lastName;
		int age;
		String location;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		firstName=input.nextLine();
		
		System.out.println("Please enter your last name: ");
		lastName=input.nextLine();
		
		System.out.println("Please enter your location: ");
		location=input.nextLine();
		
		System.out.println("Please enter your age: ");
		age=input.nextInt();
		
		System.out.println(firstName +" "+ lastName + " "+location+" "+age);
		
		
	}

}
