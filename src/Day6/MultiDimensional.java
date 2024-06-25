package Day6;

public class MultiDimensional {

	public static void main(String[] args) {
          
		int a[][]=new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=100;
		a[1][1]=200;
		
		a[2][0]=100;
		a[2][1]=200;
		
		System.out.println(a[0][0]);//100
		
		
		//apporach 2
		int x[][]= {  {100,200},
				{300,400},
				{500,600}
		};
		
		System.out.println("leghtofrows:"+x.length);//3
		System.out.println("leghtofcolum:"+x[0].length);//2

		
		System.out.println(x[0][0]);//100
		System.out.println(x[2][1]);//600
		System.out.println(a[2][1]);//200


		//displayallvaluesfromarray
		
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				System.out.print( x[r][c]+" ");
			}
			System.out.println();
		}
		
		
		//approach3===ehacedFORloop
		
			for(int ar[]:x) {
			for(int xy:ar)
			{
				System.out.print(xy+" ");
			}
			System.out.println();

		}
			
		///Multi datatypes in sigle variable
			
		Object	o[]= {10,10.5,"Welcome",true,'A'};
			
		for(Object ob:o)
		{
			System.out.println(ob);
		}
		
		
		for(int i=0;i<=o.length-1;i++)
		{
			System.out.println(o[i]);
		}
			
		}
	}


