package Day6;

public class Arrays {

	public static void main(String[] args) {
         //Declare an array
		/*
		int a[]=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		
		System.out.println(a[2]);
*/
		
		int a[]= {100,200,300,700,400,500}; 
		
		System.out.println(a[2]); //300
		
		//length of the array
		System.out.println(a.length); //5
		
	//	readallvaluesfromarrayusigForLOOP
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]); //100 200.....
		}
		
		
		
		//enhanced FOR loop
		
		for(int x:a)
		{
			System.out.println(x);
		}
		
		
		
		
	}

}
