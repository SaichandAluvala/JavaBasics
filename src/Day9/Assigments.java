package Day9;

import java.util.Scanner;

public class Assigments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		//Given string is Palindrome or not
	  //Remove junk or Special characters in a string 
		//How to remove spaces in a string
		//Count of occurance of a character in a string
		//Count nor of words in a string
		
		
		//Given string is Palindrome or not
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your String : ");
		String name=scan.next(); 
		String reverse="";
		
		
		for (int i=name.length()-1; i>=0; i--)
		{
			reverse=reverse+name.charAt(i); 
		} 
		System.out.println("Reverse is : " +reverse);
		
		if (name.equals(reverse))
		{
			System.out.println("MADAM is a Palindrome");
		} else {
			System.out.println("MADAMA is not a Palindrome");
		}
		
		
		 //Remove junk or Special characters in a string 
		
		name="Saicha##78ch**9n/@d"; 
		String aftername=name.replace("#","").replace("*","").replace("7","").replace("8","").replace("9","").replace("/","").replace("@",""); 
		System.out.println("Aftername : " +aftername);
	
		
		//How to remove spaces in a string
		name="Sai ch a nd";
		System.out.println(name.replace(" ","")); 
		
		//Count of occurance of a character in a string
       String newname="Saichand Aluvala" ;
      String newname2= newname.toLowerCase();
		long scount=newname2.chars().filter(ch-> ch=='s').count();
		long acount=newname2.chars().filter(ch-> ch=='a').count();
		long icount=newname2.chars().filter(ch-> ch=='i').count();
		long ccount=newname2.chars().filter(ch-> ch=='c').count();
		long hcount=newname2.chars().filter(ch-> ch=='h').count();
		long ncount=newname2.chars().filter(ch-> ch=='n').count();
		long dcount=newname2.chars().filter(ch-> ch=='d').count();

		
		
	System.out.println("e count is : " +scount +acount +icount +ccount +hcount +ncount +dcount);
	
	//Count nor of words in a string

	String sentance ="The quick lady dog jumps over the lazy cat";
	System.out.println(sentance.split("\\s+").length); // "\\s+ is the space delegate of a string"
	
	}			
	}


