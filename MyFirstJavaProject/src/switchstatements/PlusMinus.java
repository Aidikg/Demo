package switchstatements;
import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter two double numbers");
		
		double num1, num2;
		num1=input.nextDouble();
		num2=input.nextDouble();
		double result=0;
		boolean error=false;
		
		input.nextLine();
		
		System.out.println("Select operators: + - * /");
		String operator=input.nextLine();
		
		switch(operator) {
		case "+":
			result=num1+num2;
			//System.out.println("Result of "+num1+ " + "+num2+" is "+result);
			break;
		case "-":
			result=num1-num2;
			//System.out.println("Result of "+num1+ " - "+num2+" is "+result);
			break;
		case "*":
			result=num1*num2;
			//System.out.println("Result of "+num1+ " * "+num2+" is "+result);
			break;
		case "/":
			result=num1/num2;
			//System.out.println("Result of "+num1+ " / "+num2+" is "+result);
			break;
		default:
			System.out.println("it is not operator");
			//somehow give a flag the invalid operator
			error=true;
			//break;
		}
		if(!error) {
		System.out.println("Resullt of "+num1+" "+num2+" "+operator+" "+result);
		}
	}
}
