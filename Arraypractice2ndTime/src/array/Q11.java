package array;

import java.util.Arrays;

public class Q11 {

	public static void main(String[] args) {

		int a[] = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3 };
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					cnt++;
					break;
				}

			}
		}
		System.out.println(cnt);
		int b[] = new int[a.length - cnt];
		int index = 0;
		for (int i = 0; i < a.length; i++) 
		{
			int count = 0;

			for (int j = 0; j < b.length; j++) 
			{
				if (a[i] == b[j]) 
				{
					count++;
				}

			}

			if (count == 0)

				b[index++] = a[i];

		}

		System.out.println(Arrays.toString(b));

	}

}
