package Day7;

public class SearchElementInArray {

	public static void main(String[] args) {
					
		//SearchElemet
		//Approach1
		int a[]= {10,20,3,40,50,30,30};
		//int b[]= {10,20,300,40,50,40,40};

		int search_element=3;
		boolean status = false;
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(search_element==a[i])
			{
				System.out.println("ElemetFound");
				status=true;
				break;
			}
		}	

		if(status==false)
		{
			System.out.println("ElemetNotFound");

		}
		
		//Approach2--using EnhancedForLoop
		for(int x:a)
		{
			if(search_element==x)
			{
				System.out.println("ElemetFound");
				status=true;
				break;
			}
		}	

		if(status==false)
		{
			System.out.println("ElemetNotFound");

		}
		
		
		
		
	}
	}


