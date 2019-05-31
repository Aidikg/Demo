import java.util.Scanner;

public class StringEquality {
	public static void main(String[] args) {
		String s1, s2;
		Scanner keybord=new Scanner(System.in);
		System.out.println("Enter two words");
		s1=keybord.nextLine();
		s2=keybord.nextLine();
		
		if(s1.equals(s2)) {
			System.out.println("The two lines is equal");
		} else {
			System.out.println("The two lines are not equal");
		}
		
		if(s2.equals(s1)) {
			System.out.println("Two lines is equal");
		}else {
			System.out.println("Two lines not equal ");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Lines are equal, ignoring case");
		} else {
			System.out.println("Lines are not equal, even ignoring case");
		}
	}
}
