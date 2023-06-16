package sundayOct10array;
public class indexFind
{

	public static void main(String[] args) 
	{
      int a[]= {1,2,34,56,2,24,5,3,4,566,5};
      
      int num=5;
      
      for (int i = 0; i < a.length; i++) 
      {
    	  if(num==a[i])
    		  
    		  System.out.println("found at index "+i);
    		
	 }
      if(num==0)
    	  System.out.println("not found");
	}

}
