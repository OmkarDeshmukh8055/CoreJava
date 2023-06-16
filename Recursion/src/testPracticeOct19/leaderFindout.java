package testPracticeOct19;

public class leaderFindout {

	public static void main(String[] args) {

      int a[]= {1,3,55,7,5,12};
      leader(a,0);
	}

	private static void leader(int[] a, int i) {

    if(i<a.length)
    {
    	int j=i+1;
    	int counter=0;
    	loopj(a,i,j,counter);
    	leader(a,i+1);
    }
	}
	private static void loopj(int[] a, int i, int j,int counter)
	{    
		if(j<a.length)
		{
			if(a[i]<a[j])
			{
				counter++;
			}
				loopj(a,i,j+1,counter);
		}
			else	
			if(	counter==0)
               System.out.println(a[i]);
	}

}
