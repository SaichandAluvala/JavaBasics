package Day1;

public class FirstProgram {

	public static void main(String[] args) {
        
		//swap two strings without using 3rd variable
		String s1="Java";
		String s2="Videos";
		
		
		System.out.println("Before swapping of s1, s2");
		System.out.println("s1 => " +s1);
		System.out.println("s2 => " +s2);

		
		//s1+s2 into s1
		s1=s1+s2; //10
		System.out.println(s1);
		
		//initial value of s1 into s2
		s2=s1.substring(0, s1.length()-s2.length()); //(0, 10-6) //Java
		
		//initial value of s2 into s1
		s1=s1.substring(s2.length()); //Videos
		
		System.out.println("After swapping of s1, s2");
		System.out.println("s1 => " +s1);
		System.out.println("s2 => " +s2);
         
	}

}
