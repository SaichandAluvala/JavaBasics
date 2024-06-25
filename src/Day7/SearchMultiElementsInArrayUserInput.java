package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class SearchMultiElementsInArrayUserInput {

	public static void main(String[] args) {
             //assignment 1
		
		//Sum of elements in an array
		int a[] = {1,2,3,4,5,6};	
		int even=0, odd=0;
	System.out.println("Sum of elements in an array : "  + (a[0]+a[1]+a[2]+a[3]+a[4]+a[5]) ); //21
	
	//assignment 2
	//Find Even and odd count in an array
	
	for (int i=0; i<=a.length-1; i++ )
	{
		if ( a[i]%2==0)
		{
			System.out.println( a[i]+ " Even numnber ");
			even++; 
		
		} else {
			System.out.println( a[i]+ " Odd numnber ");
			odd++; 
		}
	}
	
	System.out.println(" Total even count : " +even);
	System.out.println(" Total even count : " +odd);

	
	     //assign 3
	//Search multi elements in an array
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your number");
	int element=scan.nextInt(); 
	
	boolean elementfound=false; 
	for ( int m=0; m<=a.length-1; m++)
	{
		if ( a[m]==element)
		{
			elementfound=true; 
			System.out.println( a[m] + " Element Found");
			break; 
		} 
	}
		if(!elementfound) 
		{
			System.out.println(  " NOT Element Found");
		}
		int number[] = {10, 15, 12, 14, 13, 10 } ;
		
		System.out.println("Before sorting : "  );
		
	String stringarray=	Arrays.toString(number);
	System.out.println(stringarray );
   
Arrays.sort(number); 
	System.out.println("After sorting : " );
	Arrays.toString(number);
System.out.println(Arrays.toString(number));

  
     
	}
	}

