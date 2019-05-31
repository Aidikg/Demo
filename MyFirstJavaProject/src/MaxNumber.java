import java.util.Scanner;

public class MaxNumber {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int num1, num2, num3;
		System.out.println("Please enter 3 different numbers: ");
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		
		if(num1==num2 && num1==num3) {
			System.out.println("All equals");
		}
		else if(num1>=num2 && num1>=num3) {
			System.out.println("Max number of "+num1+", "+num2+", and "+num3+" is "+num1);
		}
		else if(num2>=num1 && num2>=num3) {
			System.out.println("Max number of "+num1+", "+num2+", and "+num3+" is "+num2);
		}
		else {
			System.out.println("Max number of "+num1+", "+num2+", and "+num3+" is "+num3);
		
		}
	}
}
