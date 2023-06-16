package sundayOct10array;

public class remove
{

	public static void main(String[] args)
	{
      int a[]= {1,2,3,45,5,7,8};
      
      int b[]=new int[a.length-1];
      
      int c=0;
      int d=0;
      
      while(c<a.length && d< b.length)
      {
    	  if(a[c]!=45)
    	  {
    		  b[d]=a[c];
    	   d++;
    	  }
    	  c++;    	  
    				  
      }
    	 for (int i = 0; i < b.length; i++) 
    	 {
			System.out.println(b[i]); 
		} 
	}

}
