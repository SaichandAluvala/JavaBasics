package Day3;

public class Operators {

	public static void main(String[] args) {
           //1.Arithmetic operators +,-,*,/,%
		
		
		// / is division to Position value
		// % is Modulo division to Remainder value
		
		int a =20, b =10;
        System.out.println("sum of a,b is : " + ( a+b ));	
        System.out.println("sub of a,b is : " + ( a-b ));			
        System.out.println("mult of a,b is : " + ( a*b ));			
        System.out.println("div of a,b is : " + ( a/b ));			
        System.out.println("Modulo div of a,b is : " + ( a%b ));	
        
        
        //2.Relational or Comparison Operators --- returns Boolean value
        
        System.out.println(a>b);  
        System.out.println(a>=b);       	

         b=20;
        System.out.println(a!=b); //false
        System.out.println(a==b); //true


        boolean result=(a<=b);
        System.out.println(result);//true 
        
        //3. Logical Operations
        //It works with Boolean datatypes only ( && || ! ) 
        
        
        boolean x=true;
        boolean y=false;
        
        System.out.println(x && y); //false
        System.out.println(x || y); //true
        System.out.println(!x);  //false
        System.out.println(!y);  //true
        
        
        boolean b1=( 10>20 );
        System.out.println(b1);
        
        System.out.println(( 10<20) && (10<30)); //true
        System.out.println(( 10<20) || (10>30)); //true

        
	}

}
