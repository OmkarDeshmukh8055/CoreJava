import java.util.Arrays;

public class Basic_Sort{
	public static void main(String[] args) {
		int a[] = { 111,1, 7, 2, 3,12,88};
//asc
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if ( a[i] > a[j])
				{
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println();
		//desc
		int b[] = { 111,1, 7, 2, 3,12,88};
	
				for (int i = 0; i < b.length; i++) 
				{
					for (int j = i+1; j < b.length; j++) 
					{
						if (b[i] < b[j])
						{
							int t = b[i];
							b[i] = b[j];
							b[j] = t;
						}
					}
				}
				for (int i = 0; i < b.length; i++)
				{
					System.out.println(b[i]);
				}
		
	}
}
