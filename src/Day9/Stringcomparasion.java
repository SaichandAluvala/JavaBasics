package Day9;

public class Stringcomparasion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //Important questions: == and equals()
		// String s="Welcome" and String s= new String("Welcome"); 
		
	/*	
		String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2); //true 
		System.out.println(s1.equals(s2)); //true
		
	*/	
		String s1=new String("welcome"); 
		String s2=new String("to jave");
		
		System.out.println(s1==s2); //false ---It comparing the Objects ( 2 different objects S1, S2) 
		System.out.println(s1.equals(s2)); //true --It comparing the values of the objectes ( both are same) 
		
		
		//CASE 3
		
		String a1="abc";
		String a2=new String("abc");
		
		System.out.println(a1==a2); //false 
		System.out.println(a1.equals(a2)); //true
		
		
		
		//Case 4
		String s3="abc";
		String s4=new String("abc");
		String s5=s4;
		
		System.out.println(s3==s4); //false
		System.out.println(s3.equals(s4));//true
		System.out.println(s4==s5);  //true 
	}

}
