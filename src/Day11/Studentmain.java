package Day11;

public class Studentmain {

	public static void main(String[] args) {
		
/*   //1. Using object reference variables
		Student s1=new Student();
		s1.sID=123;
		//s1.name="Saichand Aluvala";
		s1.Grade='A';
		s1.printdata();

		s1.sID=12345;
		//s1.name="Saichand Aluvala123";
		s1.Grade='f';
		
		s1.printdata();
		*/
	/* // 2. using calling userDefined Method
		Student s2=new Student();
		s2.valuedate(121, "PrabhasRaju", 'A');
		s2.printdata();
	*/
		
		//3. Using Constructor **
		Student st=new Student(123, "Shirisha", 'C'); 
		
		st.printdata();
	}

}
