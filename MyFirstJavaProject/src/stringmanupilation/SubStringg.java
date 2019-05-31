package stringmanupilation;
import java.util.*;

public class SubStringg {
	public static void main(String[] args) {
		//Scanner input=new Scanner(System.in);
		String s="Your account number: 57389ACC";
		int i=s.indexOf(":")+2;
		
		if(s.charAt(i)=='2') {
			int len=s.length()-4;
			String cut=s.substring(i,len);	
			System.out.println(cut);
		}
		else {
			int len=s.length()-3;
			String cut=s.substring(i,len);	
			System.out.println(cut);
		}
	
	}
}
