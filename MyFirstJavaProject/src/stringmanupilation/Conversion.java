package stringmanupilation;
import java.util.*;

public class Conversion {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean multip;
		
		System.out.println("Please enter the string ");
		String str=input.nextLine().trim();
		
		if(str.isEmpty()) {
			System.out.println("Enter data");
		}
		else {
			if(str.contains(" ")) {
				multip=true;
			}
			else {
				multip=false;
			}
			System.out.println("Multiple words: "+multip);	
			System.out.println("Your word: "+str);
		}
		
		
		
//		if(str.contains(" ")) {
//			manup=true;
//		}
//		else {
//			manup=false;
//		}
//		System.out.println("Manupulating words: "+manup);
		
		
//		String color="blue";
//		double price=44.99;
//		boolean isSunny=true;
//		String s="";
//		String result=price+" "+color+s+isSunny;
//		
//		String priceInstring=price+"";
//		System.out.println(priceInstring);
//		
//		boolean check=s.isEmpty();
//		System.out.println(check);
		
// contains() Method
//		String name="what do you know about me";  
//		System.out.println(name.contains("do you know"));  
//		System.out.println(name.contains("about"));  
//		System.out.println(name.contains("hello"));  
		   
	}
}
