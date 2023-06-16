package arrayRecursion;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int i=0;
		int a[]= {1,2,3,4,5,6,7};
		int j=a.length-1;

loopi(a,i,j);
System.out.println(Arrays.toString(a)); 

	}

	private static int loopi(int[] a, int i, int j) {

if(i<a.length/2)
{
	
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
loopi(a, i+1, j-1);
}
return a[i];
	}

}
