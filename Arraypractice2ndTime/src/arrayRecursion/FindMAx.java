package arrayRecursion;

public class FindMAx {

	public static void main(String[] args) {

int a[]= {1,2,3,4,5,9,7,8};

int max=Integer.MIN_VALUE;
loopi(a,0,max);

	}

	private static void loopi(int[] a, int i,int max) {

		if(i<a.length)
		{
			if(a[i]>max)
				max=a[i];
			loopi(a, i+1, max);
		}
		if(i==a.length)
			System.out.println(max);
	}

}
