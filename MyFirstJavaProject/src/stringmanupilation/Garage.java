package stringmanupilation;

public class Garage {
	public static void main(String[] args) {
		String garage="Toyota, Nissan, Honda, BMW, Mazerati, Ford";
		garage=garage.toLowerCase();
		
		if(garage.isEmpty()) {
			System.out.println("no cars in garage");
		}
		else {
			if(garage.contains("toyota") || garage.contains("nissan")) {
				System.out.println("There is a Japanese car in garage");
			}
			if(garage.contains("bmw")) {
				System.out.println("There is a German car in garage");
			}
			if(!garage.contains("bmw")){
				System.out.println("No German cars");
			}
			if(garage.contains("mazerati")){
				System.out.println("There is an italian car in garage");
			}
			if(garage.contains("jaguar")){
				System.out.println("There is an British car in garage");
			}
			if(!garage.contains("jaguar")){
				System.out.println("no british car");
			}		
		}
	}
}
