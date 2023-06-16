package testOct23;

import java.util.Iterator;

public class Q4 {

	public static void main(String[] args) {
       int a[]= {1,1,1,1,1,2,2,3,4};
       int b[]= {1,2,4};
     
     
       for (int i = 0; i < b.length; i++) 
       {  int counter=0;
		for (int j = 0; j < a.length; j++)
		{
			if(a[j]==b[i])
		
				counter++;
				if(counter==2)
				break;
       }
		  int c[]=new int [a.length-counter];
		  int removecount=0;
		  int index=0;
		  for (int j = 0; j < a.length; j++)
		  {
			if(a[j]!=b[i] || removecount>=2)
			{
				c[index++]=a[j];
			}
				else
				
					removecount++;
				
		  }
			a=c;
		  }
			for (int j2 = 0; j2 < a.length; j2++) {
				System.out.println(a[j2]);
			
			
		  }
			
	}

}
