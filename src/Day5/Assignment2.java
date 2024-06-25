package Day5;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) { 
		
		//Nested For loop 
	
		/*
		0
		10
		210
		3210
		*/
		
		/* int i=0 ; 
		int rows = 4;
		for (i=0; i<rows;i++)
		{	
			for (int j=i; j>=0; j--)
			{
			System.out.println(j); //0 //10
           }
	    }
*/
		/*
		12
		24
		36	
		*/
		
		int rows=3;
		int i=1;
		
		for ( i=1; i<rows; i++)
		{
			for (int j=i; j>=0; j--)
			{
				System.out.println(j);
			}
		}
		
}}