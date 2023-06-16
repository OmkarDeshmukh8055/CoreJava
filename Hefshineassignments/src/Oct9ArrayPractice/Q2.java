package Oct9ArrayPractice;

import java.util.Arrays;

public class Q2 
{
// insertion sorting
	public static void main(String[] args) 
	{
      int []a= {1,5,7,8,3,6,2,4,9};
      
      for (int i = 0; i < a.length; i++) 
      {
    	  int temp=a[i];
    	  int start=0;
		for (int j = i-1; j >=0; j--) 
		{
		  if(a[j]<temp)
		  {
			  start=j+1;
			  break;
		  }
			  
		}
		for (int j = i-1; j >=start; j--)
		{
			a[j+1]=a[j];
		}
		a[start]=temp;
	  }
      //System.out.println(Arrays.toString(a));
      for (int i = 0; i < a.length; i++) 
      {
		System.out.println(a[i]);
	  }
	}

}
