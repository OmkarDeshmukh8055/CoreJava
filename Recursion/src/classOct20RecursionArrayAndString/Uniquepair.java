package classOct20RecursionArrayAndString;

public class Uniquepair {

	public static void main(String[] args) {
      
		int []a= {2,4,3,5,6,-2,7,8,9};
		
		int i=0; int j=0;
		checkuniquepair(a,i,j);
	}

	private static void checkuniquepair(int[] a, int i, int j) 
	{
     
		if(i<a.length && j<a.length)
		{
			if(a[i]+a[j]==9)
			System.out.println(a[i]+" "+a[j]);
			
			if(j<a.length-1)
				j++;
			else
			{
				i++;j=i+1;
			}
			checkuniquepair(a,i,j);
		}
	}

}
