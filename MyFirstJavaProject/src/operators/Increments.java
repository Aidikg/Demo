package operators;

// we use only for Numbers
// In programming mostly used postIncrement and postDecrement
// mostly used in : counters
public class Increments {
	public static void main(String[] args) {
		int size=50;
		System.out.println(size);
		
		// Incremental
		System.out.println(++size);
		System.out.println(size);
		
		System.out.println(size++);  
		System.out.println(size);
		
		// Example 2
		int age=45;
		int otherAge;
		otherAge=age;
		System.out.println(otherAge);
		System.out.println(age);
		
		otherAge=age++;
		System.out.println(otherAge);
		
		otherAge=++age;
		System.out.println(otherAge);
		
		// Decremental
		
		int size2=20;
		System.out.println(size2--); // 20
		System.out.println(size2);  // 19
		
		System.out.println(--size2); // 18
		System.out.println(size2);  // 18
		
		
		
		
		
		
		
		
		
		
		
	}
}
