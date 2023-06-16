package testPracticeOct19;

public class leaderFind {

	public static void main(String[] args) {
       
		int a[]= {1,2,12,4,5,6,22,7};
	     findleader(a,0);      
		
	}

	private static void findleader(int[] a, int i) {
         
		if(i<a.length)
		{
			int j=i+1;
			int counter=0;
			loopj(a,i,j,counter);
			findleader(a,i+1);
		}
	}

	private static void loopj(int[] a, int i, int j, int counter) 
	{
         if(j<a.length)
         {
		 if(a[j]>a[i])
		 {
			 counter++;
		 }
			 loopj(a,i,j+1,counter);
		 
         }	 
		 else
		 {
			 if(counter==0)
				 System.out.println(a[i]);
		 
         }		 
	}

}
