package testPracticetillOct23;

import java.util.Iterator;

public class removeDuplicate {

	public static void main(String[] args) {
 int a[]= {1,2,3,5,5,6,6,7,7};
 
 int duplicateCount=0;
 
 for (int i = 0; i < a.length; i++) 
 { 
	for (int j = i+1; j < a.length; j++) 
		
	{
		if(a[i]==a[j])
		{
					duplicateCount++;
		}
		break;
		}
 }
int b[]=new int[a.length-duplicateCount];
int index=0;
         for (int i = 0; i < a.length; i++) 
         {     int count=0;
		     for (int j = 0; j < b.length; j++)
		     {
			    	if(a[i]==b[j])
			    		count++;
			 }
		 	if(count==0)
				 b[index++]=a[i];
		}
         for (int i = 0; i < b.length; i++) 
         {
			System.out.print(b[i]);
		}
	}

}
