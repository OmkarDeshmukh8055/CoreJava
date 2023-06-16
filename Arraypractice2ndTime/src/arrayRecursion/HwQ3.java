package arrayRecursion;

public class HwQ3 {

	public static void main(String[] args) {

		int a[]= {1,87,7,5,43};
		int b[]=new int [a.length];
loopi(a,0,b);
	}

	private static void loopi(int[] a, int i, int[] b) {

if(i<a.length)
{
	b[i]=a[i];
	System.out.print(b[i]+" ");
	loopi(a,i+1,b);
}
	}

}
