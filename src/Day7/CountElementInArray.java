package Day7;

import java.util.Arrays;

public class CountElementInArray {

	public static void main(String[] args) {
				int a[]= {10,20,30,40,10,20,50,40};
				int num=40;
				int count=0;
				for(int i=0;i<=a.length-1;i++)
				{
					if(num==a[i])
					{
						System.out.println("ElementFound");
						count++;
					}
				}
				
				System.out.println("numerofcount :"  +count);
				
				//sortAnArray
				
				System.out.println("Before Sorting.....");
				System.out.println(Arrays.toString(a));
				
				System.out.println("After Sorting.....");
				Arrays.sort(a);
				System.out.println(Arrays.toString(a));


	}

}
