package Day6;

public class Assignment {

	public static void main(String[] args) {
				
		//find sum of an array
		int a[]= {1,2,3,4,5};//15
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum+=a[i];

			System.out.println(a[i]);
		}
		System.out.println("Sum;"+sum);
	

	
	//print even and Add nors with cout from an array
	int x[]= {1,2,3,4,5,6};
	int even=0;
	int odd=0;
	
	
	for(int s:x)
	{
		if(s%2==0) {
			System.out.println("even:"+s);
			even=even+1;
		}
			else {
				System.out.println("odd:"+s);

				odd=odd+1;

			}
		}
	System.out.println("even:"+even);
	System.out.println("odd:"+odd);

	}
	

}
