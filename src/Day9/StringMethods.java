package Day9;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //Reverse a String *** //approach 1
		
		String name="Saichand Aluvala"; 
		String reverse=""; 
		String reverse2=""; 

		
		for (int i=name.length()-1; i>=0; i-- )
		{
			reverse=reverse+name.charAt(i); 
		}
		System.out.println("reverse a string is " +reverse);
		
		
		//To change the String to Char
		
		char c[]=name.toCharArray();
		
		for ( int j=name.length()-1; j>=0; j--)
		{
			reverse2= reverse2+c[j];
		}
		System.out.println("2nd time reverse a String : " +reverse);
		
		//*** String is a Immutable but StringBuffer and StringBuilder are Mutable 
		
		
		//using StringBuffer class
		
		StringBuffer name2=new StringBuffer("Saichand");
		System.out.println("3rd time reverse a string is " +name2.reverse());
		
		//using StringBuilder class
		StringBuilder name3=new StringBuilder("Shirisha");
	    System.out.println("4th time reverse a string is " +name3.reverse()); 
	    
	    
	    
	    
	   
	    
	  
	    
	    
	}
}
