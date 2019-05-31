package switchstatements;

public class Switcher {
	public static void main(String[] args) {
		String name="James";
		
		if(name=="John") {
			System.out.println("John Wick");
		}
		else if(name=="James") {
			System.out.println("James is cool name");
		}
		else if(name=="Jamie") {
			System.out.println("Jamie is ok name");
		}
		else {
			System.out.println("everything else");
		}
		
//		switch(name) {     // "John" the same
//		case "James":
//			System.out.println("James is a cool name");
//			break;
//		case "Jamie":
//			System.out.println("Jamie is ok name");
//			break;
//		case "John":
//			System.out.println("John Wick");
//			break;
//		default:
//			System.out.println("Everything else");
//		}
	}
}
