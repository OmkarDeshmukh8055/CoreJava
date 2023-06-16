package arrayRecursion;

public class Q16 {

	public static void main(String[] args) {

int a[]= {11,22,33,44,5,55,110,77,99};
int min=Integer.MAX_VALUE;
int i=0;
int max=Integer.MIN_VALUE;

int minnum=loopi(a,i,min);
System.out.println(minnum);

	}

	private static int loopi(int[] a, int i, int min) {

if(i<a.length)
{
	if(a[i]<min)
		min=a[i];
	 return loopi(a,i+1, min);
}
return min;

	}

}
