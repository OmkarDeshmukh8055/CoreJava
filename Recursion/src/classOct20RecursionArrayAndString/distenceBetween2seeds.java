package classOct20RecursionArrayAndString;

public class distenceBetween2seeds 
{
	static int min=Integer.MAX_VALUE;
     static int m=5 ,n=8;
	public static void main(String[] args) 
	{
		int a[]= {1,4,3,1,5,8,8,0,5,3};                 // {2,3,3,3,4,3,5,6,-2,4,7,4,2,9};
		int i=0;
		loopi(a,i);
		System.out.println(min);
    }
	private static void loopi(int[] a, int i) {
          
		if(i<a.length)
		{
			if(a[i]==m)
			{
				int j=0;
				loopj(a,i,j);
			}
			loopi(a,i+1);
		}
	}

	private static void loopj(int[] a, int i, int j) 
	{
       if(j<a.length)
       {
         if(a[j]==n)
         {
        	if(i>j)
        	{
        		if(i-j<min)
        			min=i-j;
        	}
        	else
        	{
        		if(j-i<min)
        			min=j-i;
        	} 
        	
         }
         loopj(a,i,j+1);
        }
        
       
	}
}