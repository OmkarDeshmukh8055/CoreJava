package Basic;

public class Sum {

	public static void main(String[] args) {
		int a[]= {11,22,33,44,55,66,77};
		int sum=0;
	sum=add(a,0,sum);
		System.out.print(sum);
	}

	private static int add(int[] a, int i,int sum)
	{
		if(i<a.length)
		{
			sum=sum+a[i];
			return add(a, i+1,sum);
		}
		return sum;

	}

}
