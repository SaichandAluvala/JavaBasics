package Day5;

public class WhileLoop {

	public static void main(String[] args) {
		 int i=1;
	        
	        while(i<=10)
	        {
	        	if ( i%2 == 0)
	        	{
	        	System.out.println(i + " is even number");
	        	}
	        	else {
	        		System.out.println(i + " is odd number");
	        	}
	        	i++;
	        }
	        
	        
	        // Print 1 to 10 decreatment order
	        
	        i=10;
	        while ( i>=1)
	        {
	        	System.out.println(i);
	        	i--; 
	        }
	        
	        
	        //Do While loop print the statement atleast once without condition
	        
	        
	        int a=1;
	        do 
	        {
	        	System.out.println(a);
	        	a++;
	        }while (a<=10) ;
	        
	        
	        //DO while loop from 10 to 1
	        
	        i=10;
	        do
	        {
	        	System.out.println(i);
	        	i--;
	        	
	        }while ( i>=1);
	      
	}

}
