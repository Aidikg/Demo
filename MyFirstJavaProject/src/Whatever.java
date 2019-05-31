import java.util.Scanner;

public class Whatever {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

	    
	    //Task 3
	    int numberOfCall;
	    double bill=0.0;
	    System.out.println("Enter number of calls:");
	    numberOfCall = input.nextInt();
	    
	    // your code here. (DO NOT change existing code)
	    //----------------------------------------------

	    if(numberOfCall<=100){
	    	  bill=200;
	    	  System.out.println("Your bill is $"+bill);
	    	}
	    	else if(numberOfCall>100 && numberOfCall<=150){
	    	  bill=((numberOfCall-100)*0.60)+200;
	    	  System.out.println("Your bill is $"+bill);
	    	}
	    	else if(numberOfCall >150 && numberOfCall<=200){
	    	  bill=200+0.60*50+(0.50*(numberOfCall-150));
	    	  System.out.println("Your bill is $"+bill);
	    	}
	    	else{
	    	  bill=200+(50*0.60)+((numberOfCall-150)*0.50);
	    	  System.out.println("Your bill is $"+bill);
	    	}
	   
	    
	   
	    //----------------------------------------------
	   // System.out.println("Your change is "+quarter+" quarters, "+dime+" dimes, and "+nickle+" nickels.");
	}

}
