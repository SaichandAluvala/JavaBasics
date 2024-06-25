package Day5;

public class JumpingStatements {

	public static void main(String[] args) {
          //Jumping Statements are Break, Continue:
		
		
		for( int i=1; i<=10; i++)
		{
			if (i==5)
			{
				break; 

			}
			System.out.println(i);
		}
		
		//Continue 
		
		for ( int i=1; i<=10; i++)
		{
			if ( i==3 || i ==5 || i==7)
			{
				continue; 
			}
			System.out.println(i);
		}
		
	}

}
