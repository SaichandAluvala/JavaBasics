package Day3;

public class TernaryOperator {

	public static void main(String[] args) {
     //Ternary Operator
		
		//var=exp ? result1:result2
		//if condition true, result1 will be assinged and if fails, result2 will be assigned
		int a=200, b=100;
		int x= (a>b)? a:b;
		System.out.println(x); //200
		
		
		int y=(a<b)? a:b;
		System.out.println(y); //100
		
		
		int age=10;
		String result=( age>=18) ? "Eligible" : "Not eligible" ;
		
		System.out.println(result); 
		
		
		//Assignment : swapping 2 nors using 3rd variable
		
		int ax=100, by=200;
		
		int newVar;
		
		newVar=ax; //100
		ax=by; //200
		by=newVar; //100
		
		System.out.println("ax value after swapping : " +ax); //200
		System.out.println("by value after swapping : " +by); //100

		//Swapping 2nors without using 3rd variable
		
		ax=ax-by; //100
		by=by+ax;
		
		System.out.println("ax value after swapping without 3rd var : " +ax); //100
		System.out.println("by value after swapping without 3rd var : " +by);  //200
		
		
		//swapping of 2 Strings
		
		String name1="Saichand Aluvala";
		String name2="Praveen Devaraju";
		
		String temp=name1; //SA
		name1=name2; //PD
		name2=temp; //SA
		
		System.out.println("name1 after swapping : " +name1);
		System.out.println("name2 after swapping : " +name2);

 //Main : 2 Strings swapping without 3rd variable
		
		String s1 ="Java";
		String s2 ="Videos";

		
		System.out.println("Before Swapping of a two Strings");
		System.out.println(" s1 => " +s1);
		System.out.println(" s2 => " +s2);

     //Step 1: s1+s2 store into s1
		s1=s1+s2; //JavaVideos //10
		
		
		//Step 2: initial value of s1 into s2
		s2=s1.substring(0, s1.length()-s2.length()); //(0, 10-6) 
		
		//Step 3: initial value of s2 into s1
		s1=s1.substring(s2.length()); //
		      
		System.out.println("Aftere Swapping of a two Strings");
		System.out.println(" s1 => " +s1);
		System.out.println(" s2 => " +s2);

		
	}


}
