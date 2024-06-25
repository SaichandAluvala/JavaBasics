package Day7;

public class MissingnumberinArray {
	
	  public static void main (String[] args) {
		//missing number from 1 to 5; 
		  int x[]= {2,4,1,3};
		  
		  int missingnumber=findmissingnumber(x,5);
		  System.out.println("missing number is " +missingnumber);
	  }
	    public static int findmissingnumber(int x[], int totalcount)
	    {
	    	int expected=totalcount*(totalcount+1)/2;
	    	int actual=0;
	    	
	    	for ( int y:x)
	    	{
	    		actual+=y; 
	    	}
	    return expected-actual; 
	}
	}