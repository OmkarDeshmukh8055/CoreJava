package testPracticeOct20;

public class UniquePaira {

	public static void main(String[] args) {
  int a[]= {1,9,8,7,6,4,5,3,2};
  int i=0,j=i+1;
  uniquePAir(a,i,j);
	}

	private static void uniquePAir(int[] a, int i, int j)
	{
          if(a.length>i && j<a.length)
          {
        	  if(a[i]+a[j]==7)
        	  {
        		 System.out.println(a[i]+" "+a[j]);
        	  }
        	  if(j<a.length-1)
        		 j++;
        	  
        	  else
        	  {
        		 i++; j=i+1;
        		 
        	  }
          uniquePAir(a,i,j);
          }
	}
}

