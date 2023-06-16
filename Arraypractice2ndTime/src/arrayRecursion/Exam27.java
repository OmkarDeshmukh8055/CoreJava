package arrayRecursion;

import java.util.Arrays;

public class Exam27 {

	public static void main(String[] args) {

int a[]= {1,4,2,3};

int []result=loopi(a,0,0);
System.out.println(Arrays.toString(result));
	}

	private static int[] loopi(int[] a, int i, int j)
	{
 if(i<a.length)
 {
	 loopj(a,i,0);
	 return loopi(a, i+1,j);
 }
		return a;
	}

	private static int [] loopj(int[] a, int i, int j) {
		if(j<i)
		{
			if(a[i]<a[j])
			{
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];
				return loopj(a, i, j+1);
			}
		}
		return a;
		
	}

}
