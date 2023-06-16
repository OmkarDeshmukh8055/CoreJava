package day21String11ctStrat;

import java.util.Arrays;

public class removeduplicagteele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int[]a= {1,2,3,4,5,2,2,2,2,2,4,4,3,3};
		
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
		System.out.println();
		int b[]=new int[a.length-count];
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b.length; j++)
			{
				if(a[i]==a[j])
				{
					b[i]=a[i];
				}
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(b[i]);
		}
	
		
		
		
	
	
		
   
   
   
   
	}

}
