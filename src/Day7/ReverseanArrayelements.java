package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseanArrayelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a[]= {10, 20, 15, 24, 13, 11} ;
          
          //Reverse an Array
          
          for ( int i=a.length-1; i>=0; i--)
          {
        	  System.out.println(a[i]); // 11
          }
          
          
          //Input from user and enter a values into Array
          
          int x[]=new int[5];
          
          Scanner scan=new Scanner(System.in); 
          for (int y=0; y<=x.length-1; y++)
          {
        	 System.out.println("Enter a value : ");
        	 x[y]=scan.nextInt();
          }
		
          System.out.println("Printing values of Array");
          
          System.out.println(Arrays.toString(x));
          
          
          //Assignments
          //Sorting elements of an array
          
          
         // Arrays.toString(x);
          System.out.println("Before sorting : " +Arrays.toString(x));
          //after sorting elements
          
          Arrays.sort(x);
         
          System.out.println("After Sorting : "  +Arrays.toString(x) );
          
          
	}

}
