package testPracticeOct20;

public class uniquepair {

	public static void main(String[] args) {
           
		int []a= {1,2,-3,3,5,6,-1,7,8,10,9,-3,0,-6,1};
		int i=0,j=0;
		uniquepairfind(a,i,j);
	}

	private static void uniquepairfind(int[] a, int i,int j) {
              
		if(i<a.length && j<a.length)
		{
			if(a[i]+a[j]==0)
			
				System.out.println(a[i]+" "+a[j]);
			
			if(j<a.length-1)
				j++;
			
			else
			{
				i++;j=i+1;
			}
			
			uniquepairfind(a,i,j);
		}
		
	}

}
