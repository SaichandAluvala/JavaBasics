package Day9;

public class StringandStringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //String ---immutable ---we cannot change the main value
		
		String name="Welcome";
		name.concat("to Java"); 
		
		System.out.println(name);
		
		//StringBuffer is Mutable --we can change
		
		StringBuffer name2=new StringBuffer("Welcome");
		name2.append("to Java");
		System.out.println(name2);
		
		//StringBuilder is Mutable -- we can change
		 
		StringBuilder name3=new StringBuilder("Welcome");
		name3.append("to Java");
		System.out.println(name3);
		
	}

}
