package RealPractice;

public class LtiMindtree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Find a largestword in a String
		// String name = "Iam a good Programmer"; 
		
		//2. How to handle dynamic changing elements using selenium with java
		//3. How to handle windows  popups ( ctrl+s) 
		//4. Parallel testing using Selenium (Chrome, Firefox, Edge etc) 
		
		
		 String name=" my name is Saichand are SaichandReddy reddy";
	      String largestword="";  
	      String[] words=name.split(" "); 
	      
	      for (String word: words) //words=Iam, word=Iam //words=a, word=a
	      
	      {
	         if ( word.length()>largestword.length()) //3>0 //1>3 //4>3 //11>4
	         {
	             largestword=word; //largestword=3 
	             System.out.println(largestword); //Iam
	         }
	      }
	      System.out.println("Largest word is ===  " +largestword);
	}

}
