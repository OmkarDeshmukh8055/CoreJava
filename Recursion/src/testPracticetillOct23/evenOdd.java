package testPracticetillOct23;

import java.util.Arrays;

public class evenOdd {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int evencount = 0;
		int oddcount = 0;
		for (int i = 0; i < a.length; i++) 
		{
						if (a[i] % 2 == 0)
				evencount++;
			else
				oddcount++;
		}
		int[] even = new int[evencount];

		int odd[] = new int[a.length - evencount];
		int indexEVEN = 0;
		int countEVEN = 0;
		int indexOdd = 0;
		int countOdd = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] % 2 == 0) {
				indexEVEN++;
				even[countEVEN++] = a[i];
			}
			else 
			{
				indexOdd++;
				odd[countOdd++] = a[i];
			}

		}
		System.out.println(Arrays.toString(even));
		System.out.println();
		System.out.println(Arrays.toString(odd));

	}

}
