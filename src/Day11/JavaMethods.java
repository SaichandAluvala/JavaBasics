package Day11;

public class JavaMethods {
  
	//No Parameters -- No Return value
	void m1()
	{
		System.out.println("Hello!");
	}
	

	//No Parameters -- Return value
	String m2()
	{
     return("Hello! How are you? ");
	}
	
	
	//Parameters -- No Return value
	void m3(String name)
	{
		System.out.println("Hello! " +name);
	}
	
	//Parameters --- Return value
	String m4(String name)
	{
		return("Hello m4()" +name); 
	}
	
}


