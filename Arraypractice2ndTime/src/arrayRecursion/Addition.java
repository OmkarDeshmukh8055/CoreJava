package arrayRecursion;

public class Addition {

	public static void main(String[] args)
	{
		int a[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		int i = 0;
		loopi(a, i, sum);

	}

	private static void loopi(int[] a, int i, int sum) 
	{
		if (i < a.length)
		{

			sum = sum + a[i];

			loopi(a, i + 1, sum);

		}
		if (i == a.length)
			System.out.println(sum);

	}

}
