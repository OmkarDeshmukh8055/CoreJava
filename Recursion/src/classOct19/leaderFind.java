package classOct19;

public class leaderFind {

	public static void main(String[] args) 
	{
         int a[]= {1,9,4,8,3,10,5,6};
         int i=0;
         loopi(a,i);
	}

	private static void loopi(int[] a, int i) 
	{
          
		if(i<a.length)
		{
			 int j=0;
			int counter=0;
			loopj(a,i,j,counter);
			loopi(a,i+1);
		}
	
	}
	private static void loopj(int[] a, int i, int j, int counter) {
        
		if(j<a.length)
		{
			if(a[i]<a[j])
			
				counter++;
				loopj(a,i,j+1,counter);
				
			}
			else
			{	
			if(counter==0)
				System.out.println(a[i]);
			
		}
	}

}
