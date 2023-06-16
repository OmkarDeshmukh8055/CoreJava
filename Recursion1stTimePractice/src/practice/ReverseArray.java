package practice;

public class ReverseArray {

	public static void main(String[] args) {

		int a[]= {4,7,9,5,3,1,2};
		int j=a.length-1;
		a=reverse(a,j,0);
		print(a,0);
	}

	private static void print(int[] a, int i)
	{
			if(i<a.length)
			{
				System.out.print(a[i]+" ");
				print(a,i+1);
			}
		
	}

	private static int[] reverse(int[] a, int j, int i)
	{	
		if(i<a.length/2)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
			reverse(a, j, i+1);
		}
		
		return a;
	}

}
