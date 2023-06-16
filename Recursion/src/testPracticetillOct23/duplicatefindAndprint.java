package testPracticetillOct23;

import java.util.Arrays;

public class duplicatefindAndprint {

	public static void main(String[] args) {
           int []a= {1,2,3,4,5,6,8,8,7,6,8};
          
           int  count=0;
           for (int i = 0; i < a.length; i++) 
           {
        	  
        	   for (int j = i+1; j < a.length; j++) 
        	   {
				  if(a[i]==a[j])
				  {
				   count++;
				  }
				   break;
        	   }
		}
           int b[]=new int [a.length-count];
            int index=0;
          
           for (int i = 0; i < a.length; i++) 
           {      int counter=0;
			  for (int j = 0; j < b.length; j++) 
			  {
				   if(a[i]==b[j])
				   
				  counter++;
				   
           }
           if(counter==0)
        	   b[index++]=a[i];
           }
           for (int i = 0; i < b.length; i++) 
           {
			System.out.print(b[i]);
		   }
        	   
           
	}

}
