package Day5;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) { 
		// Reverse a number 
	//	Q: 12345 A: 54321
		
		
	/*  int number=12345;
	  String reverse=""; 
	    String Intnumber= Integer.toString(number);
		char ch;
		
		System.out.println("Original number is : " +number);
		for ( int i=Intnumber.length()-1; i>=0; i--) {
			ch=Intnumber.charAt(i);
			reverse=reverse+ch; 
		}
		 System.out.println("Reverse a number in string is " +reverse);
		 
		 int reverseInt=Integer.parseInt(reverse); 
		 System.out.println("Reverse a number in Int is " +reverseInt);
		
		*/
		// Palindrome number 121 
		
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number2=scan.nextInt();
		char ch;
		String reverse="";
	
		System.out.println("Enter number is " +number2);
		
		
		String numberString=Integer.toString(number2);
		System.out.println("Number in String is " +numberString);
		
		
		
	     for ( int i=numberString.length()-1; i>=0; i--) {
	    	 
	    	 ch=numberString.charAt(i);
	    	 reverse=reverse+ch;
	     }
	     System.out.println("Reverse number is : " +reverse);
	     
	     //String to Int
	     
	    int StringInt=   Integer.parseInt(reverse);
	    System.out.println("Reverse number in Inter is " +StringInt);
	    
	    
	    if (number2==StringInt) {
	    	System.out.println("The number is  Palindrome");
	    } else {
	    	System.out.println("The number is not Palindrome");
	    }
	    
	    
	    */
		//count nor of digit in a number   
		
		
		// int number=12345; //5
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number : ");
		int number= scan.nextInt();
		
		String intString=Integer.toString(number);
		int count=intString.length(); 
		
		System.out.println("Number of Digits in number : " +count);
		*/
		
		// count how many even and odd numbers in a number 2345678 
		//4 even, 3 odd
		
		//int number = 23456789; 
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number"); //123
		int number= scan.nextInt(); 
		
		String intString=Integer.toString(number); 
		char ch;
		int evencount = 0, oddcount=0; 
		
		for (int i=0; i<intString.length(); i++)
		{
		char character= intString.charAt(i); //1
		 
		 
		  if ( character%2==0)
		  {
			  evencount++; //1
			  //System.out.println( character +" is Even number");
		  } else 
		  {
			  oddcount++; 
		  }

	
		}
		
		System.out.println("NUMBER OF EVEN NUMBERS " +evencount);
		System.out.println("NUMBER OF ODD NUMBERS " +oddcount);
*/
		//sum of digits in a number
		
		//123 = 6
		 int number2=12345;
		 int sum = 0; 
		for ( int i=0 ; number2>0 ; i++)	 
		  {
			  sum= sum+ number2%10; 
			  number2= number2/10; 
		  }
		 
		  System.out.println("Sum of Digits : " +sum);
	}
	}

