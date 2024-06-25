package Day8;

import java.util.Arrays;

public class JavaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="  Welcome to java "; 
		//String s=new String("   Welcome   "); 
		
		System.out.println(s);
		System.out.println(s.length());
		
		//trim() method to remove the spaces from left side and right sides in a string
		
		System.out.println(s.trim());
		
		System.out.println(s.trim().length());

		
		  String x="We";
			System.out.println(x.length());
      x.trim();
      System.out.println( x.trim().length());
      
      //ChartAt() This method returns a single character of Index in a string
      
      x.charAt(0);
      System.out.println(x.charAt(0)); //W
      
      //contains() This method returns True or False
      
      System.out.println(s.contains(x)); //true
      
      //equals(), equalIgnorecase() - Compare Strings
      System.out.println(s==x); //false
      System.out.println(s.equals(x)); //false
      System.out.println(s.equals("welcome")); //false
      System.out.println(s.equalsIgnoreCase("welcome")); //true

      //replace() --replace with single character in a string and replace with word in a string
      
      String name="My name is SAichand and LeArning Selenium with Java"; 
      name.replace('a', 'X'); 
      
      System.out.println("before replace String : " +name);
      System.out.println("After replace String : " +name.replace('a', 'X'));
      
      name.replace("Selenium", "C#"); 
      System.out.println("After replace String : " + name.replace("Selenium", "C#")); 

      
      //subString() - Substring index of characters in a String
      
    System.out.println( name.substring(3));//name --
    System.out.println( name.substring(3, 7));//name
	
	///toUpperCase() toLowerCase() 
    
       System.out.println(name.toUpperCase()); 
       System.out.println(name.toLowerCase()); 
       
       
       
       //split()*** - Split the String into 2 parts 
       
       s="abc@gmail.com"; 
       String a[]=s.split("@"); //it will be stored into Array datatype 
       
     System.out.println( a[0] ); //abc
     System.out.println( a[1] ); //gmail.com
     
         System.out.println(Arrays.toString(a))    ;
         
         //replace - This method replace with string characters
         
        String amount ="$15,150,100/15"; 
     System.out.println( amount.replace("$", "").replace(",","").replace("/","") );
     
     
     name = "abc/123@gmail.com";
     String arr1[]=name.split("/");
      System.out.println(Arrays.toString(arr1)); //abc, 123@gmail.com
      
    String arr2[]=  arr1[1].split("@"); 
    System.out.println( Arrays.toString(arr2) ); //123, gmail.com
      
      
      System.out.println(arr1[0]);
      System.out.println(arr2[0]);
      System.out.println(arr2[1]);
      
      System.out.println(arr1[0] +" "+ arr2[0] +" "+ arr2[1] );

	}

}
