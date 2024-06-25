package Day5;

public class LoopStatements {

	public static void main(String[] args) {
         //While loop
		//Ex: Print 1-10 numbers
		
		int i=1; //Initialization
		while (i<=10) { //Condition
			System.out.println(i);
			i++; 
		}
		System.out.println("While loop closed");
		
	
		//Ex: Print Hello Message for 10 times
		
		
		i=1;
		while(i<=10)
		{
			System.out.println("Hello Message");
			i++;
		}
		
		
		i=1;
		while (i<=10)
		{
			if (i%2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("While loop ended");
	}

}
