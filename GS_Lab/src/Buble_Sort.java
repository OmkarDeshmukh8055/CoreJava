
public class Buble_Sort {

	public static void main(String[] args) {


	int a[] = { 111,1, 7, 2, 3,12,88};
	//asc
			for (int i = 0; i < a.length; i++) 
			{
				for (int j = 0; j < a.length-1-i; j++) 
				{
					if ( a[j] > a[j+1])
					{
						int t = a[j];
						a[j] = a[j+1];
						a[j+1] = t;
					}
				}
			}
			for (int i = 0; i < a.length; i++)
			{
				System.out.println(a[i]);
			}
	}

}
