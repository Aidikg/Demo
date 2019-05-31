import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your Grade");
		int grade=input.nextInt();
		
		if(grade>100) {
			System.out.println("Out of grade");
		}
		else if(grade <=100 && grade >=90) {
			System.out.println("Your grade is A ");
		}
		else if(grade < 90 && grade >=80) {
			System.out.println("Your Grade is B ");
		}
		else if(grade < 70 && grade >=60) {
			System.out.println("Your grade is C");
		}
		else {
			System.out.println("You dont pass exam");
		}
	}
}
