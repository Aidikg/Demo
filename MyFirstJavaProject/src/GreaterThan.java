import java.util.Scanner;

public class GreaterThan {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number");
		int num=input.nextInt();
		
		if(num<=10 && num>=0) {
			System.out.println("Number between 0-10");
		}
		else if(num> 10 && num <=50){
			System.out.println("Number between 10-50");
		}
		else if(num > 50 && num <=100) {
			System.out.println("Number between 50-100");
		}
		else {
			System.out.println("Out of credentials");
		}
	}
}
