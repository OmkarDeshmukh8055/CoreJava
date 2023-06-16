package array;

public class ArrayCheckUsingReturnType {

	public static void main(String[] args) {

		int a[]= {1,2,3}; 
		int b[]= {1,0,3}; 
		int diffcount=0;
		int i=0;
		
		if(a.length==b.length)
		{
			diffcount=check(i,a,b,diffcount);
		if(diffcount==0)
		{
			System.out.println("same");
		}
		else
			System.out.println("not same (element)");
		}
		else
			System.out.println("not same (length)");

	}

	private static int check(int i, int[] a, int[] b, int diffcount)
	{	
		if(i<a.length)
		{
			if(a[i]!=b[i])
			{
				diffcount++;
				return diffcount;
			}
		
			return check(i+1,a,b,diffcount);
	     }
		else
		return diffcount;
	}

}
