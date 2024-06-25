package Day3;

public class IncrDecreOperators {

	public static void main(String[] args) {
          // ++ Increment operator
		
		int a=10; 
		System.out.println(a);
		
		//increament by +1 generally
		a++; //a=a+1; //post increament --- first assign then increament
		System.out.println(a);
		
		a=20;
		int result=a++;
		System.out.println(result); //20
        System.out.println(a);//21
		
        a=30; 
		int result2= ++a; ///pre increment --- first increament then assign
		System.out.println(result2); //31
        System.out.println(a);//31
        
        
        //Decrement by -1 generally 
        
        a=40;
        //a--; //a=a-1; post decrement
       int dec1=a--;
        System.out.println(a); //39
       System.out.println(dec1); //40
        
        
        a=50;
        --a; //a=a- pre decrement
      int dec2=a--;
        System.out.println(a); //48
      System.out.println(dec2); //49

        

        
	}

}
