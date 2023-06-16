package Basic;

public class Sorting_Array {

	public static void main(String[] args) {
		int a[]= {11,9,8,3,7,4,5,12,1,10,2,6};
		sortI(a,0);
		print(a,0);
	}

	private static void print(int[] a, int i) 
	{
		if(i<a.length)
		{
			System.out.println(a[i]);
			print(a,++i);
		}
	}

	private static void sortI(int[] a, int i) {
		if(i<a.length)
		{
			int j=i+1;
			sortJ(a,i,j);
			sortI(a,i+1);
		}
	}

	private static void sortJ(int[] a, int i, int j) 
	{
		if(j<a.length)
		{
			if(a[i]>a[j])
			{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
			sortJ(a,i,j+1);
		}
	}

}
