package arrayRecursion;

public class FindMAx2 {

	public static void main(String[] args) {

int a[]= {1,2,3,4,5,9,7,8};

int max=Integer.MIN_VALUE;
   int result =loopi(a,0,max);
   System.out.println(result);
   
   int max2=Integer.MIN_VALUE;
   int secondmax=loopj(a,max2,result,0);
   System.out.println(secondmax);

	}

	private static int loopj(int[] a, int max2, int result,int i) {

if(i<a.length)
{
	if(result!=a[i] && max2<a[i])
	{
		max2=a[i];
	}
	return loopj(a,max2,result,i+1);
}
return max2;
	}

	private static int loopi(int[] a, int i,int max) {

		if(i<a.length)
		{
			if(a[i]>max)
				max=a[i];
			return loopi(a, i+1, max);
		}
			return max;
	}

}
