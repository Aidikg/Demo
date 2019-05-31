package tasks;
import java.util.*;

public class Message {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Write your message");
		String msg=input.nextLine();
		
		boolean status, delivered;
		Random random=new Random();
		
		int num=random.nextInt();
		
		if(msg.length()>=15) {
			status=true;
		}
		else {
			status=false;
		}
		
		// Task2
		if(num%2==0) {
			delivered=true;
		}
		else {
			delivered=false;
		}
		
		System.out.println("Message "+ msg);
		System.out.println("Status: "+ status);
		System.out.println("Delivered: "+ delivered);
		
		
		
		
		
		
		
//		if(num%2==0) {
//			delivered=true;
//			System.out.println("Your message delivered");
//		}
//		else {
//			delivered=false;
//			System.out.println("Your message not delivered");
//		}
		
		
	}
}
