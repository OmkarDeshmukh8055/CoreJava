package Basic;

public class Selection_Sort {

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
		int min=i;
		int j=i+1;
		min=sortJ(a,min,j);
		
		int temp=a[i];
		a[i]=a[min];
		a[min]=temp;
		sortI(a,i+1);
	}
}

private static int sortJ(int[] a, int min, int j) 
{
	if(j<a.length)
	{
		if(a[min]>a[j])
		{
		min=j;
		}
		return sortJ(a,min,j+1);
	}
	return min;
}

}
