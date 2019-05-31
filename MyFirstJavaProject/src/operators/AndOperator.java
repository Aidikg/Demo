package operators;

public class AndOperator {
	public static void main(String[] args) {
		
		int age=17;
		String name = "James";
		
		System.out.println(age>21);
		System.out.println(name=="James");
		
		boolean result = (age>21) && (name == "James") && (5==5);  // AND
		System.out.println("AND Result: " +result);
		
		result = (age>21) || (name == "Jame") || (10<5);     // OR
		System.out.println("OR Result: " +result);
		
		result = (age>21) && (name == "James") || (10>5);     // OR - AND
		System.out.println("OR - AND: "+result);
		
	}
}
