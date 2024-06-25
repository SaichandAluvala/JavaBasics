package Day4;

import java.util.Scanner;

public class Nestedifelse {

	public static void main(String[] args) {
        //Weekdays based on numbers
		/*
		 * int day=10;
		 * 
		 * if ( day == 1) { System.out.println("Sunday"); } else if ( day ==2 ) {
		 * System.out.println("Monday"); } else if ( day == 3) {
		 * System.out.println("Tues"); } else if ( day ==4 ) {
		 * System.out.println("Wed"); } else if ( day == 5) { System.out.println("Thu");
		 * } else if ( day ==6 ) { System.out.println("Fri"); }else if ( day == 7) {
		 * System.out.println("Sat"); } else { System.out.println("Invalid number"); }
		 */
		
		
		//Switch Case
		
		//int weekno = 1;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("your weekno");
		int weekno=scan.nextInt();
		
		switch (weekno){
			case 1: System.out.println("Sunday"); break;
			case 2: System.out.println("Mon"); break;
			case 3: System.out.println("Tue"); break;
			case 4: System.out.println("Wed"); break;
			case 5: System.out.println("Thu"); break;
			case 6: System.out.println("Fri"); break;
			case 7: System.out.println("Sat"); break;
			default : System.out.println("Invalid number");
			
		}
		
		
		//Assignement: largest 2nors using if else and ternary 
		
		
		int a=100, b=200, c=300;
		
		int result=(a>b )? a:b ;
		System.out.println("big number is " +result);
			
		if ( a>b) {
			System.out.println("a is big number");
		} else {
			System.out.println("b is big number");
			
		}
		
		
		//Ass: smallest of 3 nors (using if else)
		
		if ((a<b) && (a<c)) {
			System.out.println("a is the smallest number");
		} else if ((b<a) && (b<c)) {
			System.out.println("b is the smallest number");
		} else {
			System.out.println("c is the smallest number");
		}
		
		//Ass: display weekno based on weekname
		
		String day="Thurs";
		
		switch (day) {
		case "Sunday": System.out.println("0"); break;
		case "Monday": System.out.println("1");break;
		case "Tue": System.out.println("2");break;
		case "Wed": System.out.println("3");break;
		case "Thu": System.out.println("4");break;
		case "Fri": System.out.println("5");break;
		case "Sat": System.out.println("6");break;
		default : System.out.println("Invalid day");
		}
	}

}
