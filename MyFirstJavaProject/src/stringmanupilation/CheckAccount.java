package stringmanupilation;

public class CheckAccount {
	public static void main(String[] args) {
		String s="Account Number: 5575ACCD";
		int indexFirst=s.indexOf(":")+2;
		char firstDigit=s.charAt(indexFirst);
		String account;
		
		if(firstDigit=='2') {
			account=s.substring(indexFirst, indexFirst+6);
		}
		else {
			account=s.substring(indexFirst, indexFirst+5);
		}
		System.out.println(account);
		
		
		//Example 3
//		int first=s.indexOf(":")+2;
//		String accNumber=s.substring(first);
//		char fnum=accNumber.charAt(0);
//		
//		if(fnum=='2') {
//			//String accNumber=s.substring(first);
//			if(accNumber.length()==6) {
//				System.out.println("Valid");
//			}
//			else {
//				System.out.println("Invalid");
//			}
//		}
//		else {
//			//String accNumber=s.substring(first);
//			if(accNumber.length()==5) {
//				System.out.println("Valid");
//			}
//			else {
//				System.out.println("Invalid");
//			}
//		}
		
		
		// Example 2
//		int first=s.indexOf(":")+2;
//		String accNumber=s.substring(first);
//		if(accNumber.length()==8) {
//			System.out.println("Valid account number");
//		}
//		else {
//			System.out.println("invalid account number");
//		}
	
		
		//Example 1
//		int check=s.indexOf(" ")+1;
//		
//		if(s.charAt(check)=='N') {
//			System.out.println("Starts with Upper Case");
//		}
//		else {
//			System.out.println("Starts with Lower Case");
//		}
	}
}
