package day19Array;

public class removeelementInArray {

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 1, 1, 2, 2, 3, 4 };
		int[] b = { 1, 2, 4 };

		int count = 0;
		for (int i = 0; i < a.length; i++)
		{
			int cnt = 0;

			for (int j = 0; j < b.length; j++)
			{
				if (b[j] == a[i]) 
				{
					cnt++;
					break;
				}
			}
			int x = 0;
			for (int j = 0; j < i; j++) 
			{

				if (a[i] == a[j]) 
				{
					x++;
				}

			}
			if (cnt == 0)
				count++;
			if (x >= 2)
				count++;

		}
		//System.out.println(count);
		int c[]=new int [count];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			int cnt = 0;

			for (int j = 0; j < b.length; j++)
			{
				if (b[j] == a[i])
				{
					cnt++;
					break;
				}
			}
			int x = 0;
			for (int j = 0; j < i; j++)
			{

				if (a[i] == a[j])
				{
					x++;
				}

			}
			if (cnt == 0)
				c[index++]=a[i];
			if (x >= 2)
				c[index++]=a[i];
		}
		for (int i = 0; i < c.length; i++)
		{
			System.out.println(c[i] + " ");

		}
	}

}
