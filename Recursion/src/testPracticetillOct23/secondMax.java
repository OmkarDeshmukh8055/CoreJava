package testPracticetillOct23;

public class secondMax {

	public static void main(String[] args) {
		int[] a = { 2, 8, 9, 7, 5, 12, 51, 4 };
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] > max)
				max = a[i];
		}

		System.out.println(max);
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] != max) {
				if (a[i] > max2)
					max2 = a[i];
			}
		}
		System.out.println(max2);

	}

}
