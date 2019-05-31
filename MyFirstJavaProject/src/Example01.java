import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String gender1="Male";
		String gender2="Female";
		
		System.out.println("Enter your gender");
		String gender=input.nextLine();
		
		if(gender.equals(gender1)) {
			System.out.println(gender1);
		}
		else if(gender.equals(gender2)) {
			System.out.println(gender2);
		}
		else {
			System.out.println("Invalid information");
		}
		
	}
//	String name="Ulukbek";
//	
//	
//	System.out.println("Enter your point");
//	int point=input.nextInt();
//	
//	if(point>100) {
//		System.out.println("Out of range");
//	}
//	else if(point>90 && point <=100) {
//		System.out.println("Grade A");
//	}
//	else if(point>70 && point<=90) {
//		System.out.println("Grade B");
//	}
//	else {
//		System.out.println("Failed");
//	}
//}

	
	
	
	
//	System.out.println("Enter your name");
//	String enteredName=input.nextLine();
//	
//	if(enteredName.equals(name)) {
//		System.out.println("You are in list");
//		System.out.println("Enter your point");
//		int point=input.nextInt();
//		
//		if(point>100) {
//			System.out.println("Out of range");
//		}
//		else if(point>90 && point <=100) {
//			System.out.println("Grade A");
//		}
//		else if(point>70 && point<=90) {
//			System.out.println("Grade B");
//		}
//		else {
//			System.out.println("Failed");
//		}
//	}
//	else {
//		System.out.println("Invalid name");
//	}
//	
	}


