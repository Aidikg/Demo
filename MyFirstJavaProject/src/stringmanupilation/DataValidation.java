package stringmanupilation;
import java.util.*;

public class DataValidation {
	public static void main(String[] args) {
		//Example 6
//		Scanner input=new Scanner(System.in);
//		System.out.println("Write some message");
//		String msg=input.nextLine().toLowerCase().trim();
//		int first=msg.indexOf("heck");
//		int second=msg.indexOf("silly");
//		int third=msg.indexOf("idiot");
//	
//		// if(first >=0 || second>=0 || third >=0) -> failed
//		if(first==-1 && second==-1 && third==-1) {
//			System.out.println("Message sent");
//		}
//		else {
//			System.out.println("Message failed");
//		}
		
		
		
		// Example 5 indexOf
//		Scanner input=new Scanner(System.in);
//		String breed="Huskeys";
//		int i = breed.indexOf("ke");
//		System.out.println(i);
//		// -1 if there is no such charackter
//		// ky -> give -1 
		
		//Example 4
//		Scanner input= new Scanner(System.in);
//		System.out.println("Enter your name");
//		String name=input.nextLine().toLowerCase().trim();
//		if(name.isEmpty()) {
//			System.out.println("Invalid name");
//		}
//		else {
//			if(name.charAt(0)=='a' && name.charAt(name.length()-1)=='z') {
//				System.out.println("cool");
//			}
//			else {
//				System.out.println("Not cool");
//			}
//		}
		
		//Example 3
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your name");
		String name=input.nextLine().toLowerCase().trim();
		//int i=name.length();
		
		if(name.charAt(0)=='a' && name.charAt(name.length()-1)=='z') {
			System.out.println("cool");
		}
		else {
			System.out.println("Not cool");
		}
		
		
		//Example 2
//		String colors="blue, red, yellow, white";
//		boolean check=colors.contains("red");
//		boolean check1=colors.contains("white");
//		boolean check2=colors.contains("blue");
//		
//		char c=colors.charAt(7);
//		System.out.println(c);
//		
//		System.out.println(check);
//		System.out.println(check1);
//		System.out.println(check2);
		
		// Example 1
//		Scanner input=new Scanner(System.in);
//		System.out.println("What's your name? ");
//		String name=input.nextLine().trim();
//		
//		if(name.isEmpty()) {
//			System.out.println("You didn't provide the name");
//			System.out.println("Enter your name");
//		}else {
//			System.out.println("Your name is: "+name);
//		}
		
	}
}
