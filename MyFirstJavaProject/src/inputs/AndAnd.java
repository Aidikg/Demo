package inputs;

public class AndAnd {
	public static void main(String[] args) {
		int age=18;
		String name="John";
		String weather="rainy";
		
		boolean check=(age>=21) && ((name="Adam")=="James");
		System.out.println(check);
		System.out.println(name);
		
		System.out.println();
		
		System.out.println("with one &");
		boolean check2=(age>=21) & ((name="Adam")=="James");
		boolean check3=(age>=21) & ((name="Aidina")=="James");
		boolean check4=(age>=21) & ((name="Torkun")=="James");
		System.out.println(check2);
		System.out.println(name);
		
		System.out.println();
		boolean check5=(age==21) && ((name="Asel")=="James");
		System.out.println(check5);
		System.out.println(name);
		
	}
}
