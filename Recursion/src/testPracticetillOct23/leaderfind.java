package testPracticetillOct23;

public class leaderfind 
{

	public static void main(String[] args) 
	{
        int a[]= {1,2,3,12,4,5,6,7,6,8,3,4,1};
        
        for (int i = 0; i < a.length; i++) 
        {     int count=0;
        	for (int j = i+1; j < a.length; j++)
		   { 
        	  if(a[i]<a[j])
        		  count++;
		   }	if(count==0)
			   System.out.println(a[i]);
		}
	}

}
