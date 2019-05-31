package switchstatements;

import java.util.Scanner;

public class YesNo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name;
		boolean currentStudent;
		
		System.out.println("Enter your name");
		name=input.nextLine();
		
		System.out.println("Are you student currently \nyes/no");
		String ans=input.nextLine();
		
		if(ans.equals("yes")) {
			currentStudent=true;
		}
		else {
			currentStudent=false;
		}
		System.out.println("Name: "+name);
		System.out.println("Current student "+ currentStudent);
		
		if(currentStudent) {
			System.out.println(name+ " you Rock!");
		}
		
		
	}
}
