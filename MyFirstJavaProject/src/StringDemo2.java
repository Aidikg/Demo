
public class StringDemo2 {
	public static void main(String[] args) {
		String greeting= " How do you do";
		System.out.println(greeting+ " Seven to nine"); // concat
		
		String test="abcdefg";
		System.out.println(test.length());
		System.out.println(test.charAt(1));
		// charAt(index) -> returns char at Index in this  string.
		
		System.out.println(test.substring(3));
		// Start of String -> through to the end of the string
		
		System.out.println("abc\n def");  // new line
		
		System.out.println("abc\\def"); // put backslash
		
		String test2="Hello John"; // Example convert to UpperCase
		test2=test2.toUpperCase();
		System.out.println(test2);
		
		String s1="Hello John"; // .equal() example
		String s2="hello john";
		boolean s3 =s1.equals(s2);
		System.out.println(s3);
		
		String str1="hello john";
		String str2="Hello John";
		str1=str1.toUpperCase();
		str2=str2.toUpperCase();
		boolean str3=str1.equals(str2);
		System.out.println(str3);
		
	}
}
