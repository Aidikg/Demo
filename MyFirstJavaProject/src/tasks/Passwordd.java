package tasks;

import java.util.*;

public class Passwordd {
	public static void main(String[] args) {
		
		 System.out.println("Please enter:");
		    Scanner scanner = new Scanner(System.in);
		    String n = scanner.next();
		    
		    // Your code here
		    //------------------------------------------------
		    if(n.contains("a") && n.length()<5){
		      System.out.println("A Perfect");
		    }
		    else if(n.contains("b") && n.contains("a") && n.length()>=7 && n.length()<=10){
		      System.out.println("B Perfect");
		    }
		    else if(n.contains("b") && !n.contains("a") && !(n.length()>=7 && n.length()<=10)){
		      System.out.println("Perfect");
		    }
		    else if(!n.contains("b") && n.contains("a") && !(n.length()>=7 && n.length()<=10)){
		      System.out.println("");
		    }
		    
		    else{
		      System.out.println("Sorry");
		    }
		
		
//		Scanner input=new Scanner(System.in);
//		 System.out.println("Enter word:");
//		    String str2 = input.nextLine().toLowerCase();
//		    
//		    //your code here 
//		    //---------------------------------------------------------- 
//		    int position, len;
//		    position=str2.length()/2;
//		    System.out.println(position);
//		    
//		    
//		    if(str2.length()>3 && str2.length()<100){
//		      if(str2.length()%2!=0){
//		        position=str2.length()/2;
//
//		        String c=str2.substring(position,position+1).toUpperCase();
//		        System.out.println(str2.substring(0, position)+c+str2.substring(position+1));
//		      }
//		      else {
//		    	  position=(str2.length()/2)-1;
//
//			        String c=str2.substring(position,position+2).toUpperCase();
//			        System.out.println(str2.substring(0, position)+c+str2.substring(position+2));
//			      
//		      }
//		    }
//		    else{
//		      System.out.println("Invalid enter");
//		    }
		  
	}
}
