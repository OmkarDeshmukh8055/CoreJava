package testOct20;

import java.util.Iterator;

public class q1 {

	public static void main(String[] args) {
		
 
		int [][]a= {{1,2,3},
				    {4,5,6},
				   {7,8,9}};
		int sum=0;
		int i=0;
		int j=0;
		avg(a,i,j,sum);
	}
	private static void avg(int[][] a, int i, int j, int sum) 
	{
		if(i<a.length)
		{

    if(i<a.length && j<a.length-1)
    {
    	if(j<a.length-1)
    	if(i>0 && i<a.length-1 && j>0 && j<a.length-1)
		{
			 sum=sum+a[i][j];
		}
    }
    {
    System.out.println(sum);
	System.out.println("avg "+sum/3);

    }
		}
    avg(a,i+1,j+1,sum);
	}

}
