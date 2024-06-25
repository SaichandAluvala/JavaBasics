package Day3;

public class AssignmentOperators {

	public static void main(String[] args) {
     //Assignment Operators +=, -=, =, *=, /=, %=
		
		int a=10;
		a+=15; //a=a+15;
		System.out.println(a);  //25
		
		
		a=20;
		a-=10; //a=a-10;
		System.out.println(a); //10
		
		
		a=30;
		int b=a;
		System.out.println(b); //30
		
		
		a=40;
		a*=2; //a=a*2;
		System.out.println(a); //80
		
		
		a=50;
		a/=5; //a=a/5;
		
		System.out.println(a); //10
		
		a=100;
		a%=10; //a=a%10;
		System.out.println(a); //0
		
	} 

}
