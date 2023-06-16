package mondayOct18;

public class MAXfinda {

	public static void main(String[] args) {
		int a[] = { 1, 2, 34, 45, 67, 8 };
		int max = Integer.MIN_VALUE;
		int i = 0;
		mymax(a, i, max);
	}

	private static void mymax(int[] a, int i, int max) 
	{
		if (i < a.length) 
		{

			if (a[i] > max) 
			{
               max=a[i];
               mymax(a,++i,max);
			}
			else
				System.out.println(max);
		}
	}

}
