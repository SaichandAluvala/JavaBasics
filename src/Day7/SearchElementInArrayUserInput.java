package Day7;

import java.util.Scanner;

public class SearchElementInArrayUserInput {

	public static void main(String[] args) {
					
		//SearchElemet
		//Approach1
		int a[]= {10,20,3,40,50,30,30};
		//int b[]= {10,20,300,40,50,40,40};
		int x;
		//int search_element=3;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your numer");

		int elemet=scan.nextInt();
		
		boolean status = false;
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(elemet==a[i])
			{
				System.out.println("ElemetFound");
				status=true;
				break;
			}
		}	

		if(status==false)
		{
			System.out.println("ElemetNotFound");

		}
		
		
		

		
		
	}
	}


