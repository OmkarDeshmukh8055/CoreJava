package testPracticetillOct23;

import java.util.Iterator;

public class multiplication {

	public static void main(String[] args) {
   int a[][]= {{1,1,1},
		       {2,2,2},
		       {3,3,3}};
   int b[][]={{1,1,1},
	       {2,2,2},
	       {3,3,3}};
int[] []c=new int [a.length][b.length];   
   for (int i = 0; i < a.length; i++) 
   {
	for (int j = 0; j < a.length; j++)
	{
			for (int k = 0; k < b.length; k++)
			{  
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
			}
		}
		
	}
for (int i = 0; i < c.length; i++) 
{ 
	for (int j = 0; j < c.length; j++)
	{
	    System.out.print(c[i][j]+" ");	
	}
	System.out.println();
}
	}

}
