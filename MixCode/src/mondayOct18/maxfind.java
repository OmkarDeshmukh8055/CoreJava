package mondayOct18;

public class maxfind {

	public static void main(String[] args) {
		int []a= {1,2,6,12,4,9};
		int i=0;
		int max=Integer.MIN_VALUE;
		
	maxfind(a,i,max);
	}

	private static void maxfind( int[] a,int i, int max) {

		if(i<a.length)
		{
			if(a[i]>max)
				max=a[i];
			maxfind(a,i+1,max);
		}
			else
			{
				System.out.println(max); 
			}
		
	}
}

	