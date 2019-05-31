package casting;

public class TypeCasting {
	public static void main(String[] args) {
		String msg="Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
		String sender, phone, message;
		
		int s=msg.indexOf("<")+1;
		int ss=msg.indexOf(">");
		sender=msg.substring(s,ss);
		System.out.println("Sender: "+sender);
		
		int p=msg.indexOf("[")+1;
		int pp=msg.indexOf("]");
		phone=msg.substring(p, pp);
		System.out.println("Phone: "+phone);
		
		int m=msg.indexOf("{")+1;
		int mm=msg.indexOf("}");
		message=msg.substring(m, mm);
		System.out.println("Message: "+message);
		
		//Example 2
//		String s="zebra";
//		String s2="banana";
//		int i= s.compareTo(s2); //97-98= -1  apple to banana
//		System.out.println(i);
		
		// Example 1
//		char c='&';
//		int i=c;
//		System.out.println(c);
//		
//		String s="348";
//		int y=Integer.valueOf(s);
//		int sum=y+2;
//		
//		System.out.println(y);
//		System.out.println(sum);
	}
}
