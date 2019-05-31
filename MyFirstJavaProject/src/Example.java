import java.util.*;

public class Example{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your email");
		String str=input.nextLine();
		int word=str.indexOf("Hello");
		
		if(word==-1) {
			System.out.println("dont read");
		}
		else {
			System.out.println("read");
		}
		
	}
}