package ArrayPractice;

public class findDuplicateAndPrint {

	public static void main(String[] args) {

		int a[] = { 1, 1, 1, 1, 2, 2, 2 ,4};
		int count = 0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i + 1; j < a.length; j++) 
			{
				if (a[i] == a[j]) 
				{
					count++;
					break;
				}

			}
		}
		System.out.println("count" +count);

		int b[] = new int[a.length - count];
		int index = 0;
		for (int i = 0; i < a.length; i++) 
		{   		int cnt = 0;

			for (int j = 0; j < b.length; j++)
			{
				if (b[j] == a[i])
					cnt++;
			}
			if (cnt == 0)

				b[index++] = a[i];

		}

		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(b[i]);
		}

	}

}
