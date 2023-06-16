package array;

import java.util.Arrays;

public class rightToleft {

	public static void main(String[] args) {

		// right to left
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		System.out.println(Arrays.toString(a));


		int temp = a[a.length - 1];

		for (int i = a.length-1; i >0; i--) 
		{
			a[i] = a[i - 1];
		}
		a[0] = temp;
		System.out.println(Arrays.toString(a));

	}

}
