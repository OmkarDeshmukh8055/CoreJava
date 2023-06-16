package testPracticeOct20;

public class Saddle {

	public static void main(String[] args) {
        int  a[][]= {{6,3,1},
        		    {9,7,8},
        		    {2,4,5}};
        int i=0,j=0;
        saddlefind(a,i,j);
          }

	private static void saddlefind(int[][] a, int i,int j) 
	{
         
		if(i<a.length)
		{   
			
			boolean small=smallinrow(a,i,j,0);
			boolean large =largeincol(a,i,j,0);
			if(small && large)
			
			System.out.println(a[i][j]);
			if(j<a.length-1)
				j++;
			else
			{
				j=0; i++;
			}
			saddlefind(a,i,j);
	}
	}

	private static boolean largeincol(int[][] a, int i, int j, int k)
	{
		if(k<a.length)
		{
			if(a[k][j]>a[i][j])
			return false;
			else
			return	largeincol(a,i,j,k+1);
			}
		return true;
	}

	private static boolean smallinrow(int[][] a,int i,int j,int k)
	{
          
		if(k<a.length)
		{
				if(a[i][k]<a[i][j])
				return false;
			
		else
			
		return	smallinrow(a,i,j,k+1);
		}
		return true;
	
	}
}
