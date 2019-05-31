import java.util.Scanner;

public class StringCompareto {
	public static void main(String[] args) {
		String s1, s2;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter two words");
		s1=input.nextLine();
		s2=input.nextLine();
		
		if(s1.compareTo(s2)<0) {
			System.out.println(s1+ " precedes "+s2+ " in lexicographic ordering");
		}
		else if(s1.compareTo(s2)>0){
			System.out.println(s1+ " follows "+ s2+ " in lexicographic ordering");
		}
		else{
			System.out.println(s1+ " equals "+s2);
		}
	}
}
