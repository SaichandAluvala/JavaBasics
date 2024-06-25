package Day11;

public class Student {
   /*  int sID;
     String name="Saichand Aluvala";
     char Grade;
     
     */
	
	int sID;
	String name; 
	char Grade; 
	
     void printdata()
     {
    	 System.out.println(sID+" "+name+" "+Grade);
     }
     
     void valuedate(int id, String na, char Gr)
     {
    	 System.out.println("id value is " +id);
    	 sID=id;
    	 name=na; 
    	 Grade=Gr; 
    	
     }
     
     Student(int sID1, String name1, char Grade1)
     {
    	 sID=sID1;
    	 name=name1;
    	 Grade=Grade1; 
    	int sIDtotal= sID1+10; 
    	System.out.println(sIDtotal);
     }
     
} 
