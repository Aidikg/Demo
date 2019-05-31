
public class SwitchCase {
	enum MovieRating{A, B, E};
	
	public static void main(String[] args) {
		
		MovieRating rating;
		rating=MovieRating.A;
		
		switch(rating) {
		case E: // Excellent
			System.out.println("You must watch this movie");
			break;
		case A: // Average
			System.out.println(" This movie");
			break;
		case B: // Bad
			System.out.println("Skip it");
			break;
		default:
			System.out.println("Something is wrong");
		}
		
		
		
//Example 2		
//		int key=1;
//		switch(key+3) {
//		case 1:
//			System.out.println("Cake");
//			break;
//		case 2:
//			System.out.println("Pie");
//			break;
//		case 3:
//			System.out.println("Ice cream");
//			break;
//		case 4:
//		    System.out.println("Cookies");
//		    break;
//		 default:
//			 System.out.println("Diet time");
//		}
		
		
// Example 1 Switch-Case		
//		char letter='B';
//		switch(letter) {
//		case 'A':
//		case 'a':
//			System.out.println("Some kind of A");
//		
//		case 'B':
//		case 'b':
//			System.out.println("Some kind of B");
//			break;    // try without break
//			
////		case 'C':
////		case 'c':
////			System.out.println("Some kind of C ");
//		default:
//			System.out.println("Something else");
//			break;
//		}
	}
}
