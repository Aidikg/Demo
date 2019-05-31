package switchstatements;

import java.util.Scanner;

public class AgeValidator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your Grade");
		String grade=input.nextLine();
		int len= grade.length();
		grade=grade.toUpperCase();
		//grade=grade.toLowerCase();
		
		switch(grade) {
		case "A":
			System.out.println("Great job");
			break;
		case "B":
			System.out.println("Cool");
			break;
		case "C":
			System.out.println("Good");
			break;
		case "D":
			System.out.println("Not bad");
			break;
		case "F":
			System.out.println("So so");
			break;
		default:
			System.out.println("You dont pass exam");
		}
		System.out.println(len);
		
		
		//Example 1
//      System.out.println("Enter your age");
//		int age=input.nextInt();
//		if(age<0 || age >120) {
//			System.out.println("Invalid age");
//		}
//		else {
//			switch(age) {
//			case 16:
//				System.out.println("Almost done with high school");
//				break;
//			case 24:
//				System.out.println("Almost done with university");
//				break;
//			default:
//				System.out.println("Keep living");
//			}
//		}
		//The same above
//		if(age>0 && age<=120) {
//			switch(age) {
//			case 16:
//				System.out.println("Almost done with high school");
//				break;
//			case 24:
//				System.out.println("Almost done with university");
//				break;
//			default:
//				System.out.println("Keep living");
//			}
//		}
//		else {
//			System.out.println("Invalid value");
//		}
		
	}
}
