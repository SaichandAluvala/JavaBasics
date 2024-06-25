package Day4;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
        //if, if else, nested if else, Switch case
		
		
		int age=18;
		
		if ( age>=18) {
			System.out.println("Eligible to vote");
		}
		 else {
			System.out.println("Not Eligible to vote");
		 }
		
		
		//Even or Add number
		
		//int num=13;
		
		Scanner scan=new Scanner(System.in);
		  
		  System.out.println("Enter your number : ");
		  int num=scan.nextInt(); 

		
		if ( num%2 == 0) {
			System.out.println("num " +num + " is even number");
		} else {
			System.out.println("num " +num + " is odd number");
		}
		
		
		//int number=10;
		
		if ( num == 0) {
			System.out.println("number is 0");
		} else {
			System.out.println("number is Non 0");
		}
		
		//number is +, -, 0
		
		if ( num>0 ) {
			System.out.println("number is +ve" );
		} else if ( num<0 ) {
			System.out.println("number is -ve" );
		} else  {
			System.out.println("number is Zero" );
		}
		
		
		//Larget number?
		
		int a=100, b=200, c=30;
		
		if ( a>b && a>c) {
			System.out.println("a is Largest number");
		} else if ( b>a && b>c) {
			System.out.println("b is Largest number");
		} else {
			System.out.println("c is Largest number");
		}
		
		
		if (a>b)
		{
			if (a>c) {
				System.out.println("a is big number");
			}else {
				System.out.println("a is not big number");
			}
		}
		else 
		{
			System.out.println("b or c are big number");
		}
		
	}

}
