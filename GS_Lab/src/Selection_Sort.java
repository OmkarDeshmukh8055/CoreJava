
public class Selection_Sort {

	public static void main(String[] args) {
		int a[] = { 111,11, 7, 2, 3,12,88};
		//asc
				for (int i = 0; i < a.length; i++) 
				{
					int min=i;
					for (int j =i+1; j < a.length; j++) 
					{
						if ( a[min] > a[j])
						{
							min=j;
						}
					}
							int t = a[i];
							a[i] = a[min];
							a[min] = t;
				}
				for (int i = 0; i < a.length; i++)
				{
					System.out.println(a[i]);
				}


	}

}
