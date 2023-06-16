package arrayRecursion;

public class ArrayReverseOnlyPrint {

	public static void main(String[] args) {
int a[]= {1,2,3,4,5,6,7};
int i=a.length-1;
loopi(a,i);
	}

	private static void loopi(int[] a, int i) {

if(i>=0)	
{
	System.out.print(a[i]+" ");
	loopi(a,i-1);
}
	}

}
