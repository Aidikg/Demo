package stringmanupilation;
import java.util.*;

public class NoNegativity {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Your message");
		String msg=input.nextLine();
		msg=msg.replace("u", "");
		msg=msg.replace("U", "");
		System.out.println(msg);
		
		// Example 1
//		msg=msg.replace("hate", "love");
//		System.out.println(msg);
//		
//		System.out.println(msg);
		
//		String msg2=msg.replace("hate", "love");
//		System.out.println(msg2);
//		
//		System.out.println(msg);
		
	}
}