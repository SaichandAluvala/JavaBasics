package Day11;

public class Contructor {

		int x, y; 
		
		
		Contructor () //Default Constuctor
		{
			x=100;
			y=200; 
		}
		
		Contructor (int a, int b) //Parameterized Constructor
		{
			x=a;
			y=b; 
		}
		
		void sum()
		{
			System.out.println(x+y);
		}

		public static void main(String[] args) {
		     Contructor c=new Contructor(); //Default constructor will be invoked
		     c.sum();  //300
			
			Contructor c2=new Contructor(10,20); //Parmeterized constructor will be invoked
			c2.sum();  //30
			
	}

}
