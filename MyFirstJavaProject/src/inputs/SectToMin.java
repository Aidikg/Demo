package inputs;

import java.util.Scanner;

// from second to minutes. and remaining seconds
public class SectToMin {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to time calculator");
		System.out.println("Please Enter total seconds");
		int seconds=input.nextInt();
		
		
		System.out.println(seconds +" seconds converted into: ");

		// 1 Way
		int mins=seconds/60;
		int hour= mins/60;
		int remainderMin= mins%60;
		int remainderSec=seconds%60;
		
		System.out.println(hour+ " hours");
		System.out.println(remainderMin+ " minutes");
		System.out.println(remainderSec+ " seconds");
		
//      the same example - third way
//
//		int mins=seconds/60;
//		System.out.println(mins+ " minutes");
//		
//		int remainder= seconds % 60;
//		System.out.println(remainder+ " seconds");
//		
//		int hour=mins/60;
//		int remainderHour=mins%60;
//		System.out.println(hour+" hours");
//		System.out.println(mins+ " minutes");
//		System.out.println(remainderHour+ " minutes");
//		System.out.println(remainder+ " seconds");
		
		//Converting to Hours
		// hour= min/ 60
		
//      Second way		
//		double second;
//		second=input.nextInt();
//		double minute=second/60;
//		
//		if(second % 60==0) {
//			System.out.println(second+" seconds converted into:");
//			System.out.println(minute+" minute");
//			System.out.println(second+" second");
//		} else {
//			System.out.println(second+" seconds converted into:");
//			System.out.println(minute+" minute");
//			System.out.println(second+" second");
//		}
				
	}
}
