package arrayRecursion;

public class FindMAx2a {

	public static void main(String[] args) {

int a[]= {1,2,3,4,5,9,7,8};

int max=Integer.MIN_VALUE;
   int result =loopi(a,0,max);
   System.out.println(result);
   
   
   int max2=Integer.MIN_VALUE;
   int result2=Loop2(a,0,result,max2);
   System.out.println(result2);
   
	}

	
	private static int Loop2(int[] a, int i, int result, int max2) 
	{
		if(i<a.length)
		{
			if(a[i]>max2 && a[i]!=result)
			{
				max2=a[i];
			}
		   return Loop2(a, i+1, result, max2)	;
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
