package Day5;

public class ForLoop {

	public static void main(String[] args) {
        //Print 1 to 10 nors using For Loop
		
		for(int i=10 ; i>=1; i--) 
		{
			System.out.println(i);
		}
		
		//Print 1 to 10nors only even numbers
		
		for ( int i=1; i<=10; i++)
		{
			if ( i%2 ==0)
			{
				System.out.println(i + " is even");
			} else 
			{
				System.out.println(i + " is odd");
			}
				
		}    
		
		
		
	}

}
